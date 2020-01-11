package com.github.publisherfk.aop.ch553;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fukun
 */
public class SimpleAdvice implements MethodInterceptor {
    Logger logger = LoggerFactory.getLogger(SimpleAdvice.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.info(">> Invoking " + invocation.getMethod().getName());
        Object retVal = invocation.proceed();
        logger.info(">> Done");
        return retVal;
    }
}
