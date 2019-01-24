package com.von.spaction.di;

import org.springframework.stereotype.Component;

/**
 * @author vons0
 * Component:表示Spring将会创建并管理这个Bean,
 * 如果没有指定value,默认为类名的首字母小写
 */
@Component(value = "lonelyHeartsClub")
public class SegPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sing la la la !");
    }
}
