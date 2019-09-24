package com.apress.prospring5.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {
    @Autowired
    private Inspiration inspiration;

    public void sing(){
        System.out.println("...."+inspiration.getLyric());
    }
}
