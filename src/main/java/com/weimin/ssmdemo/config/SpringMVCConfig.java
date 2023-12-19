package com.weimin.ssmdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
//@EnableWebMvc
//@ComponentScan(
//        basePackages = "com.weimin.ssmdemo",
//        useDefaultFilters = false,
//        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
//        }
//)

@ComponentScan(basePackages = "com.weimin.ssmdemo")
public class SpringMVCConfig extends WebMvcConfigurationSupport {

    /**
     * 静态资源过滤
     */
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/");
//    }

    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        System.out.println("视图解析");
        registry.jsp("/jsp/", ".jsp");
    }
}
