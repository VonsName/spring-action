package com.von.spaction.springmvc;

import java.util.HashMap;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/29 20:05
 */
public class MapTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            HashMap<Integer, String> stringSenderHashMap = new HashMap<>();
            stringSenderHashMap.put(i, i + "--");
            System.out.println("当前线程id:" + Thread.currentThread().getId() + "===当前id:" + i + "当前Id对应值:" + i + "--");
            System.out.println("当前推送消息:" + stringSenderHashMap);
        }
    }
}
