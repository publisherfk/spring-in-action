package com.github.publisherfk.aop.ch5410;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class ErrorDemo {
    public static void main(String args[]) {
        Logger logger = LoggerFactory.getLogger(ErrorBean.class);
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new ErrorBean());
        proxyFactory.addAdvice(new SimpleThrowsAdvice());

        ErrorBean proxy = (ErrorBean) proxyFactory.getProxy();
        try {
            proxy.errorProneMethod();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        try {
            proxy.otherErrorProneMethod();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
