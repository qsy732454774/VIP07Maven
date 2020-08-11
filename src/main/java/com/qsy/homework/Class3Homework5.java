package com.qsy.homework;

public class Class3Homework5 {
    public static void main(String[] args) {
        System.out.println("---------------输出1-100内的质数----------------");
        for(int i=2;i<=100;i++){
            for(int x=2;x<=100;x++){
                if (i%x==0){
                    System.out.println(i);
                }
            }
        }
    }
}
