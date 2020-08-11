package com.qsy.homework;

import java.util.Scanner;

public class Class3Homework2 {
    public static void main(String[] args) {
        System.out.println("----------输入月份查看当前季节----------");
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("现在是春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("现在是夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("现在是秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("现在是冬季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }
    }
}
