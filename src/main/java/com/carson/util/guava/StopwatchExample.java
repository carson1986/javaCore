package com.carson.util.guava;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class StopwatchExample {

    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Thread.sleep(10000L);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
