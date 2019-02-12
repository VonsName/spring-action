package com.von.spaction.thread.chapter01;

/**
 * @author ： fjl
 * @date ： 2019/2/12/012 10:59
 */
public class ConcurrencyTest {
    private static final Long COUNT = 1000000001L;

    public static void main(String[] args) throws InterruptedException {
//        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (int i = 0; i < COUNT; i++) {
                a += 5;
            }
        });
        thread.start();
        int b = 0;
        for (int i = 0; i < COUNT; i++) {
            b--;
        }
        thread.join();

        long costTime = System.currentTimeMillis() - start;
        System.out.println("concurrencyCostTime:" + costTime + "--,b:" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < COUNT; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < COUNT; i++) {
            b--;
        }
        long costTime = System.currentTimeMillis() - start;
        System.out.println("serial costTime:" + costTime + "--,b:" + b);
    }
}
