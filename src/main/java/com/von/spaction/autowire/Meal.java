package com.von.spaction.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 10:24
 * Qualifier 显示指定需要注入哪个Bean,
 * 与Primary不同,Primary是将带有Component等注解的Bean作为首选的Bean
 */
@Component
public class Meal {

    private Dessert dessert;

    @Autowired
    @Qualifier(value = "coo")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Autowired
    @MyQualifier(value = "ca")
    public void setDessert1(Dessert dessert) {
        this.dessert = dessert;
    }
}
