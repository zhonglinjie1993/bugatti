package com.bugatti.test;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");

        Scanner scanner = new Scanner(System.in);
        //String check = (scanner.nextInt() % 2 == 0) ? "偶数" : "奇数";
        //System.out.println(check);
        boolean b = scanner.hasNextInt();
        while (b) {
            String check = (scanner.nextInt() % 2 == 0) ? "偶数" : "奇数";
            System.out.println(check);
        }


    }


}
