package com.von.spaction.aop;

import org.springframework.stereotype.Service;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:48
 */
@Service
public class CompactDiscImpl implements CompactDisc {
    @Override
    public void playTrack(int num) {
        System.out.println("track..." + num);
    }

    @Override
    public void playTeacher(Teacher teacher) {
        System.out.println(teacher);
    }
}
