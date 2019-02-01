package com.von.spaction.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import javax.servlet.ServletContext;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/2/1 21:33
 */
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {


    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
        super.beforeSpringSecurityFilterChain(servletContext);
    }
}
