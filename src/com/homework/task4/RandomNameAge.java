package com.homework.task4;
import java.util.Random;
public class RandomNameAge {
    private final Random random = new Random();
    public String randomName() {
        char[] consonantLetters = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р',
                'с', 'т'};
        char[] vowelLetters = {'а', 'е', 'ё', 'и', 'о', 'у', 'я'};
        char[] name = new char[random.nextInt(2, 8)];
        for (int i = 0; i < name.length; i = i + 2) {
            name[i] = consonantLetters[random.nextInt(0, consonantLetters.length)];
        }
        for (int i = 1; i < name.length; i = i + 2) {
            name[i] = vowelLetters[random.nextInt(0, vowelLetters.length)];
        }
        name[0] = Character.toUpperCase(name[0]);
        return String.valueOf(name);
    }
    public int randomAge() {
        return random.nextInt(1, 28);
    }
}
