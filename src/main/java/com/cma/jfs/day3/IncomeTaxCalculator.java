package com.cma.jfs.day3;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your income:");
        int income = sc.nextInt();
        if (income <= 500000) {
            System.out.println("No tax");        // 0
        } else if (income >= 500000 && income<= 1000000) {
            System.out.println("Tax is 5%");
            System.out.println("your tax is" + (income * 0.05));
        } else if (income>=100000 && income<= 2000000) {
            System.out.println("Tax is 10%");
            System.out.println("your tax is" + (income * 0.1));
            // 1000
        } else if (income>=200000 && income<= 3000000){
            System.out.println("Tax is 20%");
            System.out.println("your tax is" + (income * 0.2));
            // 1500
        } else if(income>= 30000) {
            System.out.println("Tax is 30%");
            System.out.println("your tax is" + (income * 0.3));
        }
    }
    ;
}
