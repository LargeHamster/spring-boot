package com.poming.boot.config;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/7/1
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.redis.cluster")
public class RedisConfig {

    List<String> nodes;

    @Bean
    public RedisClusterConfiguration redisClusterConfiguration(){
        RedisClusterConfiguration configuration = new RedisClusterConfiguration();
        List<RedisNode> nodeList=new ArrayList<>();
        for (String node : nodes) {
            String host = StringUtils.substringBefore(node, ":");
            String port    = StringUtils.substringAfterLast(node, ":");
            nodeList.add(new RedisNode(host,Integer.parseInt(port)));
        }
        configuration.setClusterNodes(nodeList);
        return configuration;
    }

}
