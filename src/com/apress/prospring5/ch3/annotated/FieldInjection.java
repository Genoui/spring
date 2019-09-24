package com.apress.prospring5.ch3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();

        context.load("classpath:app-context.xml");
        context.refresh();

        Singer singer=context.getBean(Singer.class);

        singer.sing();

        context.close();
    }
}
