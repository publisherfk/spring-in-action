package com.github.publisherfk.aop.ch547;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author by fukun
 */
public class SecurityAdvice implements MethodBeforeAdvice {
    Logger logger = LoggerFactory.getLogger(SecurityAdvice.class);

    private SecurityManager securityManager;

    public SecurityAdvice() {
        this.securityManager = new SecurityManager();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        UserInfo userInfo = securityManager.getLoggedOnUser();
        if (userInfo == null) {
            logger.info("No user authenticated");
            throw new SecurityException("You must login before invoke the method:" + method.getName());
        } else {
            logger.info("login success,login name is:{}", userInfo.getUserName());
        }
    }
}
