package com.github.publisherfk.aop.ch547;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class SecurityDemo {
    public static void main(String args[]) {
        SecurityManager securityManager = new SecurityManager();
        SecureBean secureBean = getSecureBean();
        securityManager.login("heshi", "1");
        secureBean.writeSecureMessage();
        securityManager.logout();

        try {
            secureBean.writeSecureMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SecureBean getSecureBean() {
        SecureBean secureBean = new SecureBean();
        SecurityAdvice securityAdvice = new SecurityAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(securityAdvice);
        proxyFactory.setTarget(secureBean);
        SecureBean proxy = (SecureBean) proxyFactory.getProxy();
        return proxy;
    }

}
