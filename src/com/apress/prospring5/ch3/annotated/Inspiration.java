package com.apress.prospring5.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Inspiration {
    private  String lyric="I can keep the door cracked open,to let light through";

    public Inspiration(@Value("For all my runing.I can understand") String lyric){
        this.lyric=lyric;
    }
    public String getLyric(){
        return lyric;
    }
    public void setLyric(String lyric){
        this.lyric=lyric;
    }
}
