package com.von.spaction.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 10:20
 */
@Component
@Qualifier(value = "coo")
public class Cookies implements Dessert{
}
