package com.homework.task3;

import java.util.Scanner;

public class Rainbow {
    public static final String КРАСНЫЙ = "Red";
    public static final String ОРАНЖЕВЫЙ = "Orange";
    public static final String ЖЕЛТЫЙ = "Yellow";
    public static final String ЗЕЛЕНЫЙ = "Green";
    public static final String ГОЛУБОЙ = "Cyan";
    public static final String СИНИЙ = "Blue";
    public static final String ФИОЛЕТОВЫЙ = "Violet";

    public static final int Red = 1;
    public static final int Orange = 2;
    public static final int Yellow = 3;
    public static final int Green = 4;
    public static final int Cyan = 5;
    public static final int Blue = 6;
    public static final int Violet = 7;

    public void OneColor(int number) {

        switch (number) {
            case 1:
                System.out.println(КРАСНЫЙ);
                break;
            case 2:
                System.out.println(ОРАНЖЕВЫЙ);
                break;
            case 3:
                System.out.println(ЖЕЛТЫЙ);
                break;
            case 4:
                System.out.println(ЗЕЛЕНЫЙ);
                break;
            case 5:
                System.out.println(ГОЛУБОЙ);
                break;
            case 6:
                System.out.println(СИНИЙ);
                break;
            case 7:
                System.out.println(ФИОЛЕТОВЫЙ);
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
            case Red:
                System.out.println(КРАСНЫЙ);
                OneColor(color2);
                break;
            case Orange:
                System.out.println(ОРАНЖЕВЫЙ);
                OneColor(color2);
                break;
            case Yellow:
                System.out.println(ЖЕЛТЫЙ);
                OneColor(color2);
                break;
            case Green:
                System.out.println(ЗЕЛЕНЫЙ);
                OneColor(color2);
                break;
            case Cyan:
                System.out.println(ГОЛУБОЙ);
                OneColor(color2);
                break;
            case Blue:
                System.out.println(СИНИЙ);
                OneColor(color2);
                break;
            case Violet:
                System.out.println(ФИОЛЕТОВЫЙ);
                OneColor(color2);
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }

}
