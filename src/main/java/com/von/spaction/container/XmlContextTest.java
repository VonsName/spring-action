package com.von.spaction.container;

import com.von.spaction.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author vons0
 */
public class XmlContextTest {

    public static void main(String[] args) {
        fileSystemXmlApp();
    }

    public static void classPathXmlApp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object user = context.getBean("user");
        System.out.println(user);
    }

    public static void fileSystemXmlApp() {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\Users\\Documents\\Java\\spring-action\\src\\main\\resources\\bean.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
