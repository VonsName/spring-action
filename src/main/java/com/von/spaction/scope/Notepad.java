package com.von.spaction.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 11:20
 * Scope:Spring默认是单例的,
 * ConfigurableBeanFactory.SCOPE_PROTOTYPE:每次访问都会创建一个对象
 * WebApplicationContext.SCOPE_SESSION: 每次会话创建一个对象
 * WebApplicationContext.SCOPE_REQUEST：每次请求创建一个对象
 * WebApplicationContext.SCOPE_APPLICATION:每个应用创建一个对象
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class Notepad {
}
