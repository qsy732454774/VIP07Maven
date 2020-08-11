package com.qsy.homework;

public class Class3Homework6 {
    public static void main(String[] args) {
        System.out.println("---------附加作业----------");
        for (int i=1;i<=9;i++){
            for(int x= 1;x<=9;x++){
                if(i==x){
                    System.out.print("-----"+"\t");
                    continue;
                }
                if (i + x ==10){
                    System.out.print("-----"+"\t");
                    continue;
                }
                System.out.print(i+"*"+x+"="+i*x+"\t");

            }
            System.out.println("\n");
        }
    }
}
