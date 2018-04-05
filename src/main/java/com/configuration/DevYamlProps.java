package com.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages = {"com.*"})
//@PropertySource("classpath:common_props/common_dev.yml")
public class DevYamlProps {
    public DevYamlProps() {
        System.out.println("YESSSSYAMLLL");
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer ymlProperties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        ClassPathResource sss = new ClassPathResource("common_props/common_dev.yml");
        System.out.println(sss.exists());
        yaml.setResources(sss);
        //yaml.getObject()

        propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());

        return propertySourcesPlaceholderConfigurer;
    }
}
