package com.von.spaction.aop;

import org.springframework.stereotype.Service;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:20
 */
@Service(value = "annotationPerform")
public class AnnotationPerform implements Performance {

    @ServiceAop
    @Override
    public void perform() throws NoSuchMethodException {
        System.out.println("AnnotationPerform 执行");
    }
}
