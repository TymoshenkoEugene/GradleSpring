package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldYaml {

    final private MessageService service;

    @Value("${helloworldyaml}")
    private String HelloWorldYamlField;

    @Value("${helloyaml.worldyaml}")
    private String HelloWorldYaml2Field;

    @Autowired
    public HelloWorldYaml(MessageService service) {
        this.service = service;
    }

    public void printHelloWorldYaml() {
        System.out.println(HelloWorldYamlField);
    }

    public void printHelloWorldYaml2() {
        System.out.println(HelloWorldYaml2Field);
    }


}