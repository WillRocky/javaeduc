package com.company;

public class practica3 {
    public static void main(String[] args) {
        int [] array = new int[] {12,13,75,24,-3,-10,10,43,-11,42,16,15,45};
        int min= array[0];
        for (int i = 0; i<array.length; i++ ) {
        if (array[i] < min )
            min= array[i];
        }
        System.out.println("Min is :" + min);
        int arrayLen= array.length;
        System.out.println(arrayLen);


    }
}
