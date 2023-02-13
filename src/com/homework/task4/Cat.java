package com.homework.task4;
import java.util.Arrays;
import java.util.Random;

public class Cat {
    private String name;
    private int age;
    int counter = 0;
    private RandomNameAge randomAgeName = new RandomNameAge();

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void firstCycle() {
        while (counter < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
            counter++;
        }
        System.out.println();
    }
    private void CatToSetter() {
        Cat cat = new Cat();
        cat.setAge(randomAgeName.randomAge());
        cat.setName(randomAgeName.randomName());
        System.out.println(cat);
    }
    public void secondCycle() {
        Cat cat = new Cat();
        for (int i = 0; i < 10; i++) {
            CatToSetter();
        }
        System.out.println(cat);
    }
    public void thirdCycle() {
        Cat cat = new Cat(randomAgeName.randomName(), randomAgeName.randomAge());
        do {
            counter++;
        } while (counter < 10);
        System.out.println();
    }

    public void fourthCycle() {
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(randomAgeName.randomName(), randomAgeName.randomAge());
        }
        for (Cat cat : cats)
            System.out.println(cat.toString());
        System.out.println();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Cat() {
    }
    public static void start() {
        Cat cat = new Cat();
        cat.firstCycle();
        cat.secondCycle();
        cat.thirdCycle();
        cat.fourthCycle();
    }
}

