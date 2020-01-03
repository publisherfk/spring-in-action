package com.github.publisherfk.aop.ch549;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * @author by fukun
 */
public class ProfilingInterceptor implements MethodInterceptor {
    Logger logger = LoggerFactory.getLogger(ProfilingInterceptor.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(invocation.getMethod().getName());

        Object returnValue = invocation.proceed();
        stopWatch.stop();
        dumpInfo(invocation, stopWatch.getTotalTimeMillis());
        return returnValue;
    }

    private void dumpInfo(MethodInvocation invocation, Long ms) {
        Method method = invocation.getMethod();
        Object target = invocation.getThis();
        Object[] args = invocation.getArguments();
        logger.info("Executed method:{}", method.getName());
        logger.info("On object of type:{}", target.getClass().getName());
        logger.info("With arguments:{}", args);
        for (int x = 0; x < args.length; x++) {
            logger.info("{}:{}", x, args[x]);
        }
        logger.info("Took: {} ms", ms);
    }
}
