package com.qsy.homework;

import java.util.Scanner;

public class Class3Homework3 {
    public static void main(String[] args) {
        System.out.println("----------------礼物----------------");
        System.out.println("请输入要送的礼物：");
        Scanner sc = new Scanner(System.in);
        String gift = sc.nextLine();
        int exp = 50;
        int money = 50000;
        while (exp >=150 || money<=0){
            switch (gift){
                case "包":
                    System.out.println("你送出了一个包");
                    exp += 30;
                    money -= 5000;
                    break;
                case "口红":
                    System.out.println("你送出了一个口红");
                    exp += 20;
                    money -= 500;
                    break;
                case "QQ会员":
                    System.out.println("你送出了一个QQ会员");
                    exp -= 30;
                    money -= 100;
                    break;
                case "机械键盘":
                    System.out.println("你送出了一个机械键盘");
                    exp -= 50;
                    money -= 1000;
                    break;
            }
        }
        System.out.println("现在好感度是"+exp);
        System.out.println("恋爱基金剩余"+money);

    }
}
