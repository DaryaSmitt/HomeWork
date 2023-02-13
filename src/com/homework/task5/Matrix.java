package com.homework.task5;
import java.util.Random;

public class Matrix {
    public static final String[][] MATRIX = new String[10][10];
    public static int counter = 0;
    public static void createMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (counter % 3 == 0) {
                    MATRIX[i][j] = RandomNN.randomNumber();
                } else {
                    MATRIX[i][j] = RandomNN.randomString();
                }
                ++counter;
            }
        }
        for (String[] array : MATRIX) {
            for (String anInt : array) {
                System.out.printf(" " + anInt);
            }
            System.out.println();
        }
    }





    public static void start() {
        createMatrix();

    }
}
