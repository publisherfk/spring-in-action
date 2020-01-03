package com.github.publisherfk.aop.ch548;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author by fukun
 */
public class AgentAfterReturningAdvice implements AfterReturningAdvice {
    Logger logger = LoggerFactory.getLogger(AgentAfterReturningAdvice.class);

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.info("After " + method.getName());
        logger.info("return value is:{}", returnValue);
    }
}
