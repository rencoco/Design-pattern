package com.ryx.designpattern.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest implements Runnable {

    AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {


        AtomicTest atomicTest = new AtomicTest();

        for (int i = 0; i < 101; i++) {
            new Thread(atomicTest).start();
        }
    }

    @Override
    public void run() {
        atomicInteger.getAndAdd(1);
        System.out.println(atomicInteger.get());
    }
}
