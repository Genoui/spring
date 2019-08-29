package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
       // ctx.load("classpath:app-context-annotation.xml");
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        MessageRenderer messageRenderer=ctx.getBean("renderer",MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }
}
