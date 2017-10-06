package com.company.lab1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        boolean is =true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int count=scan.nextInt();
        for (int i = 2; i <= count / Math.sqrt(count); i++) {
            if (count % i == 0) {
                is = false;
                break;
            }
        }
        if (is) {
            System.out.println(count + " простое число");
        } else {
            System.out.println(count + " составное число");
        }
    }
}
