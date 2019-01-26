package com.von.spaction.aop;

import java.lang.annotation.*;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:17
 */
@Target(value = ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceAop {
}
