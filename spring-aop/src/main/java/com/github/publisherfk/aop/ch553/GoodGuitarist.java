package com.github.publisherfk.aop.ch553;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fukun
 */
public class GoodGuitarist implements Singer {
    Logger logger = LoggerFactory.getLogger(GoodGuitarist.class);

    @Override
    public void sing() {
        logger.info("GoodGuitarist Sing");
    }
}
