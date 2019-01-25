package com.von.spaction.autowire;

import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 10:20
 */
@Component
@MyQualifier(value = "ca")
public class Cake implements Dessert{
}
