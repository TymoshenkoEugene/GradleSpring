package com.hello;

import com.configuration.DevProps;
import com.configuration.DevYamlProps;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(basePackages = {"com.*"})
@EnableAsync
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        context.register(DevProps.class);
        context.register(DevYamlProps.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        HelloWorldYaml helloWorldYaml = context.getBean(HelloWorldYaml.class);
        helloWorldYaml.printHelloWorldYaml();
        helloWorldYaml.printHelloWorldYaml2();

        //YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
    }
}