package com.apress.prospring5.ch3;

public abstract class AbstractLookupDemoBean implements DemoBean{
    public abstract Singer getMysinger();

    @Override
    public void doSomething(){
        getMysinger().sing();
    }
}
