package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private Map<String,Object> map;
    private Properties properties;
    private Set set;
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("classpath:app-context-xml.xml");
        context.refresh();

        CollectionInjection injection=(CollectionInjection) context.getBean("injectCollection");
        injection.displayInfo();
        context.close();
    }
    public void  displayInfo(){
        System.out.println("Map contents:\n");
        map.entrySet().stream().forEach(e -> System.out.println("key: "+e.getKey()+"- value:"+e.getValue()));
        System.out.println("\n Properties contents:\n");
        properties.entrySet().stream().forEach(e -> System.out.println("key:"+e.getKey()+"value:"+e.getValue()));
        System.out.println("\n Set contents\n");
        set.stream().forEach(e -> System.out.println("value"+e));
        System.out.println("\n List contents\n");
        list.forEach(e -> System.out.println("value"+e));
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }
}
