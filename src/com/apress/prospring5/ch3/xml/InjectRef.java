package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch3.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-xml.xml");
        context.refresh();

        InjectRef injectRef=(InjectRef) context.getBean("injectRef");
        System.out.println(injectRef);
        context.close();
    }
    public String toString(){
        return oracle.defineMeaningOfLife();
    }
}
