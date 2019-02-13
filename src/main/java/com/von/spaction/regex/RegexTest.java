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
    private static final Pattern PATTERN = Pattern.compile("\\d{1,11}");

    public static void main(String[] args) {
        String str = "1321223123s";
        Matcher matcher = PATTERN.matcher(str);
        System.out.println(matcher.matches());

        int a = 1, b, c;
        a = b = a++;
        System.out.println("a:" + a);
        c = a++ + b;
        System.out.println("a:" + a); //2
        System.out.println("b:" + b); //1
        System.out.println("c:" + c); //2

        String s1 = "xiaomeng2";
        final String s2 = "xiaomeng";
        String s3 = "xiaomeng";
        String s4 = s2 + "2";
        String s5 = s3 + "2";
        System.out.println(s1 == s4);//true
        System.out.println(s1 == s5);//false
    }
}
