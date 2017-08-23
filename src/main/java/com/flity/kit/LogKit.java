package com.flity.kit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogKit {

    public static Logger getLog(Class<? extends Object> clzz) {
        return LoggerFactory.getLogger(clzz);
    }

}
