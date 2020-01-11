package com.github.publisherfk.aop.ch559;

import com.github.publisherfk.aop.ch553.Singer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarist implements Singer {
    Logger logger = LoggerFactory.getLogger(Guitarist.class);

    @Override
    public void sing() {
        logger.info("Drean if ways to throw it all away");
    }

    public void rest() {
        logger.info("rest");
    }
}
