package com.github.publisherfk.aop.main;

import com.github.publisherfk.aop.component.Agent;
import com.github.publisherfk.aop.component.AgentDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class AgentAOPDemo {
    private static final Logger logger = LoggerFactory.getLogger(AgentAOPDemo.class);

    public static void main(String args[]) {
        Agent agent = new Agent();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new AgentDecorator());
        proxyFactory.setTarget(agent);

        Agent proxy = (Agent) proxyFactory.getProxy();

        agent.speak();
        logger.info("main method after speak");
        proxy.returnSomeThing();
    }
}
