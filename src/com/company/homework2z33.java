package com.company;

public class homework2z33 {
    public static void main(String[] args) {
        int[] ars = {9, 8, 9, 8, 1, 2, 4, 3, 5, 2, 5, 6, 7, 8,};
        int[] ard = new int[10];
        for (int i = 0; i < ars.length; i++) {
            ard[ars[i]]++;
        }
            System.out.println("value\tcount");
            for (int i=0; i< ard.length; i++){
                System.out.println(i+"\t" + ard[i]);
            }
        }
    }
