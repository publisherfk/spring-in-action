package com.github.publisherfk.aop.ch555;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleBean {
    Logger logger = LoggerFactory.getLogger(SampleBean.class);

    public void foo(int x) {
        logger.info("invoke for() with:{}", x);
    }

    public void bar() {
        logger.info("invoke bar()");
    }
}
