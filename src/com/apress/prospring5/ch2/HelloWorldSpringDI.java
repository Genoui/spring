package com.apress.prospring5.ch2;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("app-context.xml");
        MessageRenderer messageRenderer=applicationContext.getBean("renderer",MessageRenderer.class);
        messageRenderer.render();
    }
}

