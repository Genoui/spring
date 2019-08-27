package com.apress.prospring5.ch2.decoupled;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory(){
        properties =new Properties();
        try{
            properties.load(this.getClass().getResourceAsStream("/msf.properties"));
            String rendererClass=properties.getProperty("renderer.class");
            String providerClass=properties.getProperty("provider.class");


            renderer  = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider  = (MessageProvider) Class.forName(providerClass).newInstance();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
    static {
        instance =new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance(){
        return instance;
    }
    public MessageRenderer getMessageRenderer(){
        return renderer;
    }
    public MessageProvider getMessageProvider(){
        return provider;
    }

}
