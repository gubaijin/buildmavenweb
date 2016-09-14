package com.spring.demo.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ehsy_it on 2016/9/12.
 */
public class TestExecutors {

    public static void main(String[] args) {
        ExecutorService cachedThread = Executors.newCachedThreadPool();

//        Executors.newc

        ExecutorService fixedThread = Executors.newFixedThreadPool(2);

        ExecutorService scheduledThread = Executors.newScheduledThreadPool(2);

        ExecutorService singleThread = Executors.newSingleThreadExecutor();

        ExecutorService singleThreadScheduled = Executors.newSingleThreadScheduledExecutor();
    }
}
