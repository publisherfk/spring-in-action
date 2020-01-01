package com.github.publisher.spring.config;

import com.github.publisher.spring.bean.BeanInitTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanInitTest beanInitTest() {
        return new BeanInitTest();
    }
}
