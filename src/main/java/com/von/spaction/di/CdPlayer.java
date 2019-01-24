package com.von.spaction.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author vons0
 */
@Component
@Profile("dev")
public class CdPlayer implements MediaPlayer {
    private CompactDisc compactDisc;
    public static int UTIL = 5;

    /**
     * 构造器注入
     * 如果没有匹配的Bean,会抛出异常
     *
     * @param compactDisc
     */
    @Autowired(required = false)
    public CdPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    /**
     * set方法注入
     *
     * @param compactDisc
     */
    @Autowired(required = false)
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
