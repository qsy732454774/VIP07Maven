package com.qsy.homework;

import java.util.Scanner;

public class Class3Homework1 {
    public static void main(String[] args) {
        System.out.println("----------判断是否为闰年----------");
        System.out.println("请输入年份（例1990）：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%400 == 0)
            System.out.println(year+"年是闰年");
        else System.out.println(year+"年不是闰年");

    }

}
