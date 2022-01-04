package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số năm cần kiểm tra");
        boolean isLeapYear = false;
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if(year%400 ==0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%s là năm nhuận", year);
        }else {
            System.out.printf("%s không phải năm nhuận", year);
        }
    }
}
