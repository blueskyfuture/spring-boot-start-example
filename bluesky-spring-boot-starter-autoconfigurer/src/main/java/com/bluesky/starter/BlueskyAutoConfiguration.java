package com.bluesky.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication //web应用才生效
@EnableConfigurationProperties(BlueskyProperties.class)
public class BlueskyAutoConfiguration {
    @Autowired
    BlueskyProperties properties;

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setProperties(properties);
        return helloService;
    }
}
