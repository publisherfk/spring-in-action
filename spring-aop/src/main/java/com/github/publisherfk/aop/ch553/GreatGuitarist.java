package com.github.publisherfk.aop.ch553;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fukun
 */
public class GreatGuitarist implements Singer {
    Logger logger = LoggerFactory.getLogger(GreatGuitarist.class);

    @Override
    public void sing() {
        logger.info("GreatGuitarist Sing");
    }
}
