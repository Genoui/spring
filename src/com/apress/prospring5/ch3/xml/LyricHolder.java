package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch3.Container;

public class LyricHolder implements Container {
    private String value="'You be the DJ，I'll be the driver'";

    @Override
    public String toString(){
        return "LyricHolder:{"+value+"}";
    }


    @Override
    public Object getDependency(String key) {
        return key;

    }

}
