package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple  {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInsSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();

        InjectSimple simple=(InjectSimple) ctx.getBean("injectSimpleSpel");
        System.out.println(simple);
        ctx.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInsSeconds(Long ageInsSeconds) {
        this.ageInsSeconds = ageInsSeconds;
    }

    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInsSeconds=" + ageInsSeconds +
                '}';
    }
}
