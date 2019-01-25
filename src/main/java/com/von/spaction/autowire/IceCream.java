package com.von.spaction.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 10:21
 * Primary 如果自动发现装配,容器有三个同一类型的bean,可以使用此注解
 * 指定首选主要的Bean
 */
@Component
//@Primary
public class IceCream implements Dessert {
}
