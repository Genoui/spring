package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-xml.xml");
        context.refresh();

        ReplacementTarget replacementTarget =(ReplacementTarget) context.getBean("replacementTarget");
        ReplacementTarget standardTarget=(ReplacementTarget) context.getBean("standardTarget");
        displayInfo(replacementTarget);
        displayInfo(standardTarget);
        context.close();
    }
    private static void displayInfo(ReplacementTarget target){
        System.out.println(target.formatMessage("Thanks fot playing,try again!"));

        StopWatch stopWatch= new StopWatch();
        stopWatch.start("perfTest");
        for (int x=0;x<10000;x++){
            String out =target.formatMessage("No filter in my head");
            //commented to not pollute the console
            System.out.print(out);
        }
        stopWatch.stop();
        System.out.println("10000 invocation took:"+stopWatch.getTotalTimeMillis()+"ms");
    }
}
