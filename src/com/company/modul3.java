package com.company;
import java.util.Scanner;
public class modul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println();
        int n = array.length;
        int temp;
        for (int i =0; i<n/2; i++ ) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i =0; i<array.length; i++) {
            //System.out.print("Перевернули массив");
            System.out.print("  " + array[i]);
        }




            //  System.out.print("Inerested array elemeents:");
            //for (int i = 0; i<size;i++) {
            //  System.out.print(" " +array [i] );


        }


    }

