package com.apress.prospring5.ch3.annotation;

import com.apress.prospring5.ch3.Container;
import org.springframework.stereotype.Service;

@Service("lyricHolder")
public class LyricHolder implements Container {
    private String value="'You be the DJ,I'll be the driver";

    @Override
    public Object getDependency(String key) {
        return null;
    }
    @Override
    public String toString(){
        return "LyricHolder:{"+value+"}";
    }
}
