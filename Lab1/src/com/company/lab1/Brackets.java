package com.company.lab1;

import java.util.Scanner;

public class Brackets {

    public static void main(String[] args) {
        System.out.println("Введите скобочную последовательность: ");
        Brackets.Scan();
    }

    public static void Scan() {
        Scanner f = new Scanner(System.in);
        String s = f.next();
        if (check(s)) {
            System.out.println("Правильная скобочная последовательность");
        } else {
            System.out.println("Неправильная скобочная последовательность");
        }
    }

    public static boolean check(String s) {
        int a[] = new int[s.length()];
        int brackets = 0;
        if (s.charAt(0) == ')') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a[brackets] = 1;
                brackets++;
            }
            if (s.charAt(i) == ')') {
                if (brackets == 0 || a[brackets - 1] == 0) {
                    return false;
                } else {
                    brackets--;
                }
            }
        }
        if (brackets != 0) {
            return false;
        } else {
            return true;
        }
    }
}