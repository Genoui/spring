package com.apress.prospring5.ch3;

public class StandardLookupDemoBean implements DemoBean {
    private  Singer mySinger;
    public void setMySinger(Singer mySinger){
        this.mySinger=mySinger;
    }

    @Override
    public Singer getMysinger() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
