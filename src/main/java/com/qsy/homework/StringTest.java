package com.qsy.homework;


public class StringTest {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        String s1=args[0];
        String s2=args[1];
        try {
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            if (i1<i2){
                System.out.println("第一个数小于第二个数");
            }else if (i1>i2){
                System.out.println("第一个数大于第二个数");
            }else {
                System.out.println("两个数大小相等");
            }
        }catch (NumberFormatException nullerror){
            nullerror.printStackTrace();
            System.out.println("传参为空");
        }
    }
}
