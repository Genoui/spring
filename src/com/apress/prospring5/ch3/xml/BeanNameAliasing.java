package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNameAliasing {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-02.xml");
        context.refresh();

        String s1=(String) context.getBean("john");
        String s2=(String) context.getBean("jon");
        String s3=(String) context.getBean("johnny");
        String s4=(String) context.getBean("jonathan");
        String s5=(String) context.getBean("jim");
        String s6=(String) context.getBean("ion");
        System.out.println((s1==s2));

        System.out.println((s2==s3));
        System.out.println((s3==s4));
        System.out.println((s4==s5));
        System.out.println((s5==s6));
        Map<String,String> beans =context.getBeansOfType(String.class);

        if (beans.size()==1){
            System.out.println("There is only one String bean.");
        }
        context.close();
    }
}
