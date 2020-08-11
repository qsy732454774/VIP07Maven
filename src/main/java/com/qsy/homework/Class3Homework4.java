package com.qsy.homework;

public class Class3Homework4 {
    public static void main(String[] args) {
        System.out.println("---------------乘法口诀表-----------------");
        for(int i =1;i<=9;i++){
            for(int x=1;x<=i;x++){
                System.out.print(i+"*"+x+"="+i*x+"\t");
            }
            System.out.println();
        }
    }
}
