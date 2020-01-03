package com.github.publisherfk.aop.main;

import com.github.publisherfk.aop.component.Agent;
import com.github.publisherfk.aop.component.AgentBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class BeforeAdviceMain {
    public static void main(String args[]) {
        Agent agent = new Agent();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new AgentBeforeAdvice());
        proxyFactory.setTarget(agent);

        Agent proxy = (Agent) proxyFactory.getProxy();
        proxy.returnSomeThing();
    }
}
