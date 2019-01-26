package com.von.spaction.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:49
 */
@Aspect
@Component
public class TrackCounter {

    private Map<Integer, Integer> trackCOuntMap = new HashMap<>(16);

    /**
     * args:表示传递给方法的参数也会传进该通知里面,即可以在切面通知里面取得方法的参数
     *
     * @param number
     */
    @Pointcut("execution(* com.von.spaction.aop.CompactDisc.playTrack(int ))" +
            "&& args(number)")
    public void track(int number) {
    }

    @Pointcut("execution(* com.von.spaction.aop.CompactDisc.playTeacher(..))" +
            "&& args(teacher)")
    public void playTeacher(Teacher teacher) {
    }

    @Before("playTeacher(teacher)")
    public void countTeacher(Teacher teacher) {
        int id = teacher.getId();
        teacher.setId(++id);
        System.out.println("teacher id:" + id);
    }

    /**
     * 要注意前置++和后置++的区别
     * 前置++:先执行++操作,再使用
     * 后置++:先使用,再执行++操作
     *
     * @param number
     */
    @Before("track(number)")
    public void countTrack(int number) {
        int trackNum = getTrackNum(number);
        trackCOuntMap.put(number, ++trackNum);
        System.out.println(trackNum);
    }

    public int getTrackNum(int trackNumber) {
        return trackCOuntMap.getOrDefault(trackNumber, 0);
    }
}
