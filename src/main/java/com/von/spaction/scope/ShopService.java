package com.von.spaction.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 11:28
 * Spring的Aop动态代理是基于接口的
 * Cglib基于类
 * ShopService是单例的,但是ShopCart不是
 * 注入的时候Spring会创建一个ShopCart的代理对象注入
 * ShopCart的proxyMode设置为ScopedProxyMode.TARGET_CLASS(会使用基于CGlib的基于普通类的代理)
 */
@Component
public class ShopService {
    private ShopCart shopCart;

    @Autowired
    public void setShopCart(ShopCart cart) {
        this.shopCart = cart;
    }
}
