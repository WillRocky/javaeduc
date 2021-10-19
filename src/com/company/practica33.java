package com.company;

public class practica33 {
    public static void main(String[] args) {
        int[] array = new int []{12, 13, 75, 24, -3, -10, 10, 43, -11, 42, 16, 15, 45};

        int max = array[0];
        for (int i =0; i< array.length; i++ ) {
            if (max < array[i]) {
                max =array[i];

            }
            else{
                max = max;
            }
        }
        System.out.println(max);

    }
}