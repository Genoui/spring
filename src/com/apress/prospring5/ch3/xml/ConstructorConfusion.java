package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {
    private String someValue;

    public ConstructorConfusion(String someValue){
        System.out.println("ConstructorConfusion(String) called");
        this.someValue=someValue;
    }
    public ConstructorConfusion(int someValue){
        System.out.println("ConstructorConfusion(int somValue) called");
        this.someValue="number:"+Integer.toString(someValue);
    }
    public String toString(){
        return someValue;
    }
    public static void main(String... args){
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();
        ConstructorConfusion cc= (ConstructorConfusion)
        ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }


}
