package com.von.spaction.di;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author vons0
 * ActiveProfiles 指定测试时运行的环境
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CdPlayerConfig.class})
@ActiveProfiles(profiles = "test")
public class ProTest {
}
