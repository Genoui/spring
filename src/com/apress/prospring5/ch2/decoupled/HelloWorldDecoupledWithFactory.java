package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer messageRenderer= MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider messageProvider= MessageSupportFactory.getInstance().getMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
