package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;
//Bean的名称别名

public class BeanCrazyNaming {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-03.xml");
        context.refresh();

        Map<String,String> beans=context.getBeansOfType(String.class);
        beans.entrySet().stream().forEach(b->
        {
            System.out.println("id:"+b.getKey()+
                    "\n aliases:"+ Arrays.toString(context.getAliases(b.getKey()))+"\n");});
        context.close();
}
}
