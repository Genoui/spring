package com.apress.prospring5.ch2.decoupled;

/**
 * 工厂类
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer messageRenderer= MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider messageProvider= MessageSupportFactory.getInstance().getMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
