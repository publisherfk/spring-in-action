package com.github.publisherfk.aop.ch548;

import com.github.publisherfk.aop.component.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class AgentMain {
    static Logger logger = LoggerFactory.getLogger(AgentMain.class);

    public static void main(String args[]) {
        Agent agent = new Agent();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new AgentAfterReturningAdvice());
        proxyFactory.setTarget(agent);

        Agent proxy = (Agent) proxyFactory.getProxy();
        proxy.returnSomeThing();
        logger.info("==========");
        proxy.speak();
    }
}
