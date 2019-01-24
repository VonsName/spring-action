package com.von.spaction.container;

import com.von.spaction.annotation.UserConfig;
import com.von.spaction.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author vons0
 */
public class AnnotationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
