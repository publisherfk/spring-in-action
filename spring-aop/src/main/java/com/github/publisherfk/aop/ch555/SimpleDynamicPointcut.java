package com.github.publisherfk.aop.ch555;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    Logger logger = LoggerFactory.getLogger(SimpleDynamicPointcut.class);

    private String matcherMethod = "foo";

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        logger.info("Static check for " + method.getName());
        return matcherMethod.equals(method.getName());
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        logger.info("Dynamic check for " + method.getName());
        int x = 0;
        if (null != args && args.length > 0 && args[0] instanceof Integer) {
            x = ((Integer) args[0]).intValue();
        }
        return (x != 100);
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == SampleBean.class);
    }
}
