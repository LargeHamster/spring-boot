package com.poming.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@Configuration
@ImportResource(value = "classpath:/xml/beans.xml")
public class BeanConfiguration {

}
