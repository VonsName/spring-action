package com.von.spaction.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ： fjl
 * @date ： 2019/2/11/011 11:21
 */
public class RegexTest {
    /**
     * + : 一次或者多次
     * * : 任意次(0次或者多次)
     * ? : 0次或者1次 当放在其他限制符后面的时候,表示非贪婪模式,尽可能少的匹配
     */
    private static final Pattern PATTERN = Pattern.compile("(zo)+");

    public static void main(String[] args) {
        String str = "zozo";
        Matcher matcher = PATTERN.matcher(str);
        System.out.println(matcher.matches());
    }
}
