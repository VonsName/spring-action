package com.von.spaction.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:57
 */
public class CompactDiscTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        CompactDisc bean = context.getBean(CompactDisc.class);
        bean.playTrack(1);
        bean.playTrack(1);
        Teacher teacher = new Teacher();
        teacher.setId(2);
        bean.playTeacher(teacher);
    }
}
