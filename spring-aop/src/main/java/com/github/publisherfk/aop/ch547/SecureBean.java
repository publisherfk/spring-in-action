package com.github.publisherfk.aop.ch547;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fukun
 */
public class SecureBean {
    Logger logger = LoggerFactory.getLogger(SecureBean.class);

    public void writeSecureMessage() {
        logger.info("Write Secure Message");
    }
}
