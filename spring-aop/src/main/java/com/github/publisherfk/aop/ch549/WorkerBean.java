package com.github.publisherfk.aop.ch549;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fukun
 */
public class WorkerBean {
    Logger logger = LoggerFactory.getLogger(WorkerBean.class);

    public void doSomeWork(int noOFTimes) {
        for (int x = 0; x < noOFTimes; x++) {
            work(x);
        }
    }

    private void work(int index) {
        logger.info("==work=={}", index);
    }
}
