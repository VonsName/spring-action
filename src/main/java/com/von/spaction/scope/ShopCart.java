package com.von.spaction.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 11:28
 * 1.WebApplicationContext.SCOPE_SESSION：表示该Bean是会话作用域的,只有当一个用户进入系统的时候才会创建该Bean
 * 2.proxyMode = ScopedProxyMode.INTERFACES
 * Spring注入的时候不会真正注入ShopCart对象,而是注入一个它的一个代理对象
 * ScopedProxyMode.INTERFACES表示该代理必须要实现ShopCart接口,
 * 但是ShopCart是一个普通类,Spring的动态代理是基于接口的,
 * 如果要实现动态代理的不是接口而是普通的类,使用CGlib(可以基于普通类代理)
 * 否则应该将proxyMode设置为 ScopedProxyMode.TARGET_CLASS(基于类的代理)
 * 3.如果在xml中配置Bean,可以使用<aop:scoped-proxy/>实现Scope注解的proxyMode功能
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShopCart {
}
