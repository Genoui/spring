package com.apress.prospring5.ch3.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:app-context-xml.xml"})
@Configuration
public class HelloWorldConfiguaration {

}
