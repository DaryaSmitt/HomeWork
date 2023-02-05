package com.homework.task5;
import java.util.Random;
public class Matrix {
    private static final String[][] MATRIX = new String[10][10];
    private static int i;
    private static int j;
    private static int num = 1;
    public static void createMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (num % 3 == 0) {
                    MATRIX[i][j] = RandomNN.randomNumber();
                } else {
                    MATRIX[i][j] = RandomNN.randomString();
                }
                ++num;
            }
        }
        System.out.println(MATRIX);
    }

    public static void start() {
        createMatrix();

    }
}
