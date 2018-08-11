package com.test.myapp;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMain {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

        logger.error("字符串快捷拼接方式一:{}, 该方式比使用加号+拼接字符串速度更快", "logger");
        logger.error("字符串快捷拼接方式二:" + "logger");
    }
}
