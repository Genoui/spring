package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
    public static void main(String... args){
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();

        DemoBean abs=ctx.getBean("abstractLookupBean",DemoBean.class);
        DemoBean sts=ctx.getBean("standardLookupBean",DemoBean.class);

        displayInfo("abstractLookupBean",abs);
        displayInfo("standardLookupBean",sts);
    }
    public static void displayInfo(String beanName,DemoBean bean){
        Singer singer1=bean.getMysinger();
        Singer singer2=bean.getMysinger();

        System.out.println(""+beanName+":Singer Instances the Same?"+(singer1==singer2));
        StopWatch stopWatch=new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x=0;x<100000;x++){
            Singer singer=bean.getMysinger();
            singer.sing();
        }

        stopWatch.stop();
        System.out.println("100000 gets took"+stopWatch.getTotalTimeMillis()+"ms");
    }

}
