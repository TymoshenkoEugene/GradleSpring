package com.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"com.*"})
@PropertySource("classpath:common_props/common_dev.properties")
public class DevProps {
    public DevProps() {
        System.out.println("YESSSS");
    }

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public static PropertyPlaceholderConfigurer propertyConfigInDev2() {
        return new PropertyPlaceholderConfigurer();
    }*/
}
