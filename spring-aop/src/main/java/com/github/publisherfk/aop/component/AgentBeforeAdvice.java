package com.github.publisherfk.aop.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author by fukun
 */
public class AgentBeforeAdvice implements MethodBeforeAdvice {
    Logger logger = LoggerFactory.getLogger(AgentBeforeAdvice.class);

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("Before " + method.getName());
        if ("returnSomeThing".equals(method.getName())) {
            throw new RuntimeException("异常测试");
        }
    }
}
