package com.github.publisherfk.aop.component;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fukun
 */
public class AgentDecorator implements MethodInterceptor {
    Logger logger = LoggerFactory.getLogger(AgentDecorator.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.info("代理类");
        Object retVal = invocation.proceed();
        logger.info("reVal is:{}", retVal);
        return retVal;
    }
}
