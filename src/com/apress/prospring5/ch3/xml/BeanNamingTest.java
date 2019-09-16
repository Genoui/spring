package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNamingTest {
    public static void main(String[] args) {
    GenericXmlApplicationContext context= new GenericXmlApplicationContext();
    context.load("classpath:app-context-01.xml");
    context.refresh();

        Map<String,String> beans= context.getBeansOfType(String.class);
        beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));

        context.close();


    }
}
