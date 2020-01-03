package com.github.publisherfk.aop.ch5410;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author by fukun
 */
public class SimpleThrowsAdvice implements ThrowsAdvice {
    Logger logger = LoggerFactory.getLogger(SimpleThrowsAdvice.class);

    public void afterThrowing(Exception ex) {
        logger.info("exception Caught:{}", ex.getClass().getName());
    }

    public void afterThrowing(Method method, Object object, Object target, IllegalArgumentException ex) {
        logger.info("method Name:{}", method.getName());
        logger.info("Object Name:{}", object.getClass().getName());
        logger.info("Target Name:{}", target.getClass().getName());
        logger.info("exception Caught:{}", ex.getClass().getName());
    }
}
