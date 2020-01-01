package com.github.publisher.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanInitTest implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, InitializingBean, DisposableBean {
    Logger logger = LoggerFactory.getLogger(BeanInitTest.class);

    public BeanInitTest() {
        logger.info("0.no arguments constructor");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("1.current bean name is: {}", name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logger.info("2.current Bean classLoader is: {}", classLoader);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("3.current ApplicationContext is: {}", applicationContext);
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("4.post Construct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("5.afterPropertiesSet");
    }

    private void initMethod() {
        logger.info("6.init method");
    }

    @PreDestroy
    public void PreDestroy() {
        logger.info("7.pre Destroy");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("8.destroy");
    }

    public void destroyMethod() {
        logger.info("9.destroyMethod");
    }
}
