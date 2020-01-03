package com.github.publisherfk.aop.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fukun
 */
public class Agent {
    Logger logger = LoggerFactory.getLogger(Agent.class);

    public void speak() {
        logger.info("2020 新的开始");
    }

    public String returnSomeThing() {
        logger.info("returnSomeThing method");
        return "return someThing";
    }
}
