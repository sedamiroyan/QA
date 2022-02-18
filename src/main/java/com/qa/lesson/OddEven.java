package com.qa.lesson;

public class OddEven {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        for (int j = 0; j < 100; j++) {
            if (j % 2 > 0) {
                System.out.print(j + " ");
            }
        }
    }
}
