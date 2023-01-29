package com.homework.task4;

import java.util.Random;

public class Cat  {
    private String name = "Пушок";
    private int age = 5;
    private final Random random = new Random();

    public Cat() {
    }
    public int randomAge() {
        return random.nextInt(1, 28);
    }
    public char randomName() {
        return (char)(random.nextInt(26) + 'A');
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;

    }



    }

