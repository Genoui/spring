package com.apress.prospring5.ch2.decoupled;

/**
 * 普通构建
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageProvider messageProvider=new HelloWorldMessageProvider();
        MessageRenderer messageRenderer=new StandarOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();

    }
}
