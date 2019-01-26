package com.von.spaction.aop;

import org.springframework.stereotype.Component;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 19:08
 */
@Component
public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("DefaultEncoreable  performEncore");
    }
}
