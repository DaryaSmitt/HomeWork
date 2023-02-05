package com.homework.task5;

import java.util.Random;

public class RandomNN {
    public static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static final Random RANDOM = new Random();
    public static String randomNumber() {

        return String.valueOf(RANDOM.nextDouble(1, 9)).substring(0, 7);
    }
    public static String randomString() {
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++)
            sb.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
        return sb.toString();
    }
}
