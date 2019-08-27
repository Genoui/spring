package com.apress.prospring5.ch2.decoupled;

public class StandarOutMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider==null){
            throw new RuntimeException("you must set the property messageProvider of class:"+StandarOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider=provider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
