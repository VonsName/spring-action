package com.von.spaction.springmvc;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author ： fjl
 * @date ： 2019/1/28/028 16:53
 */
@WebFilter(filterName = "myFilter",urlPatterns = {"/**"})
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter.....................");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
