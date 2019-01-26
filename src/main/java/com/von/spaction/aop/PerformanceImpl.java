package com.von.spaction.aop;

import org.springframework.stereotype.Service;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:08
 */
@Service
public class PerformanceImpl implements Performance {
    @Override
    public void perform() throws NoSuchMethodException {
        System.out.println("执行perform");
//        throw new NoSuchMethodException("测试No");
    }
}
