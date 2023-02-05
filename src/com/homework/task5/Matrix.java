package com.homework.task5;

public class Matrix {
    public static final String[][] MATRIX = new String[10][10];
    public static int i;
    public static int j;
    public static int number = 1;
    public static void createMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (number % 3 == 0) {
                    MATRIX[i][j] = RandomNN.randomNumber();
                } else {
                    MATRIX[i][j] = RandomNN.randomString();
                }
                ++number;
            }
        }
        System.out.println(MATRIX);
    }

    public static void start() {
        createMatrix();

    }
}
