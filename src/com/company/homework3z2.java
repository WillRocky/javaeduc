package com.company;

public class homework3z2 {
    public static void main(String[] args) {
        int[] massiv = {3, 4, 5, 4, 2, 5, 3, 4, 4, 4, 5, 9, 9, 7,};

        int count = 0;

        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i - 1] == massiv[i]) {
                System.out.println(massiv[i]);
                count++;
            }
            System.out.println(count);
        }

    }
}