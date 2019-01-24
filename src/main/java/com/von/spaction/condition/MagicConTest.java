package com.von.spaction.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : vons
 * @version : 1.0
 * @date: 2019/1/24 22:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MagicConfig.class})
public class MagicConTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MagicConfig.class);
        Magic bean = context.getBean(Magic.class);
        System.out.println(bean);
    }
}
