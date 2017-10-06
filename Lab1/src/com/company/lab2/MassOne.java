package com.company.lab2;

/**
 * Created by dobrynin on 30.09.2017.
 */

import java.util.Scanner;
import java.util.Arrays;

public class MassOne {

    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов в массиве:");
        int a[] = input();
        System.out.println("Минимальный элемент:" + min(a));
        System.out.println("Максимальный элемент:" + max(a));
        System.out.println("Среднее значение:" + arithmetic_mean(a));
        System.out.println("Медиана массива:" + median(a));
        System.out.println("Среднее геометрическое:" + geometric_mean(a));
    }

    private static int[] input() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.println("A["+i+"]");
            a[i] = in.nextInt();
        }
        return a;
    }

    private static int min(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] < min){
                min = a[i];
            }
        return min;
    }

    private static int max(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (max < a[i]){
                max = a[i];
            }
        return max;
    }

    private static float arithmetic_mean(int a[]) {
        float result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result / a.length;
    }

    private static float median(int a[]) {
        Arrays.sort(a);
        if (a.length % 2 == 0) {
            return ((a[a.length/ 2 ] + a[a.length/2-1])/2);
        } else return a[a.length/2];
    }

    private static double geometric_mean(int a[]){
        double result = 1;
        for (int i = 0; i < a.length; i++){
            result*=a[i];
        }
        return Math.exp(Math.log(result)/a.length);
    }
}

