package com.cma.jfs.day3;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your income:");
        int income = sc.nextInt();
        if (income <= 500) {
            System.out.println("No tax");        // 0
        } else if (income>=500 &&  income<= 1000) {
            System.out.println("Tax on taxable income is 5%");
            System.out.println("your tax is" + (income - 500)* 0.05);
        } else if (income>=1000 && income<= 2000) {
            System.out.println("Tax is 10%");
            System.out.println("your tax is" + (income-500) * 0.1);
            // 1000
        } else if (income>=2000 && income<= 3000){
            System.out.println("Tax is 20%");
            System.out.println("your tax is" + (income-500) * 0.2);
            // 1500
        } else {
            System.out.println("Tax is 30%");
            System.out.println("your tax is" + (income-500) * 0.3);
        }
    }

}
