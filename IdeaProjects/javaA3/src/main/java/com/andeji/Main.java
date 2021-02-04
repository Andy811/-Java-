package com.andeji;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    static org.apache.log4j.Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        logger.info("----交易日志，日志级别info----->" + "hello world" + "<--------");
    }
}
