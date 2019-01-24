package com.von.spaction.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author vons0
 * SpringJUnit4ClassRunner:测试的时候自动创建Spring的应用上下文
 * @ ContextConfiguration 指明需要加载的配置类,可以是多个
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CdPlayerConfig.class})
public class CdPlayerTest {

    @Autowired
    private CompactDisc cd;
    @Autowired
    private CdPlayer cdPlayer;

    @Test
    public void cdNotBeNull() {
        assertNotNull("对象不能为空", cd);
    }

    @Test
    public void play(){
        cdPlayer.play();
    }
}
