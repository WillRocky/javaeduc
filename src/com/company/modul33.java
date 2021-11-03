package com.company;

import java.util.Scanner;

public class modul33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Считываем размер массива:");
        int bod = scanner.nextInt();
        int A[] = new int[bod];
        System.out.println("Считываем массив :");
        for (int i = 0; i < bod; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Интересующие элементы массива :");
        for (int i = 0; i < bod; i++) {
            System.out.print(" " + A[i]);


        }
    }
}
