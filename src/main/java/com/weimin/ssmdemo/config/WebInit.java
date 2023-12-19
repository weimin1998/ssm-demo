package com.weimin.ssmdemo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * WebApplicationInitializer的作用相当于web.xml
 */
public class WebInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // spring application
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        // 加载配置文件
        applicationContext.register(SpringMVCConfig.class);
        // spring application 设置web应用上下文
        applicationContext.setServletContext(servletContext);
        //
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("test", new DispatcherServlet(applicationContext));

        springmvc.addMapping("/");

        springmvc.setLoadOnStartup(1);

        System.out.println("WebApplicationInitializer启动！");
    }
}
