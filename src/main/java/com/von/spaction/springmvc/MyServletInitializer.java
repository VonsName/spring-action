package com.von.spaction.springmvc;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author ： fjl
 * @date ： 2019/1/28/028 16:51
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        ServletRegistration.Dynamic myservlet = servletContext.addServlet("myservlet", MyServlet.class);
        myservlet.addMapping("/");
        //设置文件上传的保存的临时目录以及上传大小的限制,
        // MultipartConfigElement第三个参数表示所有文件的上传都会写到磁盘上
        myservlet.setMultipartConfig(new MultipartConfigElement("/tmp/spitte", Integer.MAX_VALUE, Integer.MAX_VALUE, 0));
        //注册filter
        servletContext.addFilter("myfilter", MyFilter.class);
    }
}
