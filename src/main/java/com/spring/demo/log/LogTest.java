package com.spring.demo.log;

import org.slf4j.Logger;

/**
 * Created by ehsy_it on 2016/7/29.
 */
public class LogTest {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        LOG.info("{}", "打印info日志");
        LOG.debug("{}", "打印debug日志");
        LOG.error("{}", "打印error日志");
    }
}
