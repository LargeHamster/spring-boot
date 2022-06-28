package com.spring.boot.config;

import com.spring.boot.handler.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 拦截器(用于拦截页面，比如需要登录的页面进行拦截)
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**");
    }

    /**
     * 全局跨域Cors配置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:8005").allowedMethods("*");
    }

    /**
     * 代替只返回视图层的@Controller
     * 视图控制器 路径映射到视图 主要是针对不需要在控制器里渲染数据的简单视图
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
    }


}
