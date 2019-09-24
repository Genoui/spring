package com.apress.prospring5.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {
    private String somValue;

    public ConstructorConfusion(String somValue) {
        System.out.println("ConstrutorConfusion(String) called");
        this.somValue=somValue;
    }
    @Autowired
    public ConstructorConfusion(@Value("80") int someValue){
        System.out.println("ConstrutorConfusion(int) called");
        this.somValue="number:"+Integer.toString(someValue);
    }

    public String toString(){
        return somValue;
    }
    public static void main(String... args){
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-xml.xml");
        context.refresh();

        ConstructorConfusion cc=(ConstructorConfusion) context.getBean("constructorConfusion");
        System.out.println(cc);
        context.close();
    }
}
