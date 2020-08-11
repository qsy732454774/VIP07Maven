package com.qsy.homework;

public class RegularTest {
    public static void main(String[] args) {
        String qqMail="12345678@qq.com";
        String wyMail="wangyi@163.com";
        String xlMail="xinlang@sina.com";

        String regulartest=".*com";
        System.out.println(qqMail.matches(regulartest));
        String regulartest1="[a-zA-Z0-9]*@(qq)|(163)|(sina)/.com";
        System.out.println(wyMail.matches(regulartest1));
    }
}
