package com.homework.task3;

import java.util.Scanner;

public class Rainbow {
    public static final String RED = "Red";
    public static final String ORANGE = "Orange";
    public static final String YELLOW = "Yellow";
    public static final String GREEN = "Green";
    public static final String CYAN = "Cyan";
    public static final String BLUE = "Blue";
    public static final String VIOLET = "Violet";

    public static final int RED1 = 1;
    public static final int ORANGE2 = 2;
    public static final int YELLOW3 = 3;
    public static final int GREEN4 = 4;
    public static final int CYAN5 = 5;
    public static final int BLUE6 = 6;
    public static final int VIOLET7 = 7;

    public void OneColor(int number) {

        switch (number) {
            case 1:
                System.out.println(RED);
                break;
            case 2:
                System.out.println(ORANGE);
                break;
            case 3:
                System.out.println(YELLOW);
                break;
            case 4:
                System.out.println(GREEN);
                break;
            case 5:
                System.out.println(CYAN);
                break;
            case 6:
                System.out.println(BLUE);
                break;
            case 7:
                System.out.println(VIOLET);
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }

    public void colorSelection() {

        System.out.println("Какой твой любимый цвет в радуге?");
        System.out.println("Хочешь выбрать один цвет - введи 1");
        System.out.println("Если хочешь смешать два цвета - введи 2");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш выбор: ");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Выберите цвет:");
                int number = scanner.nextInt();
                OneColor(number);
            } else if (choice == 2) {
                System.out.print("Выберите два цвета: ");
                int color1 = scanner.nextInt();
                int color2 = scanner.nextInt();
            } else {
                System.out.println("Давай пока остановимся на двух!");
            }

        } else {
        System.out.println("Ошибка ввода!");
    }

}

    public void TwoColor(int color1, int color2) {

        switch (color1) {
            case RED1:
                System.out.println(RED);
                OneColor(color2);
                break;
            case ORANGE2:
                System.out.println(ORANGE);
                OneColor(color2);
                break;
            case YELLOW3:
                System.out.println(YELLOW);
                OneColor(color2);
                break;
            case GREEN4:
                System.out.println(GREEN);
                OneColor(color2);
                break;
            case CYAN5:
                System.out.println(CYAN);
                OneColor(color2);
                break;
            case  BLUE6:
                System.out.println(BLUE);
                OneColor(color2);
                break;
            case VIOLET7:
                System.out.println(VIOLET);
                OneColor(color2);
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }

}
