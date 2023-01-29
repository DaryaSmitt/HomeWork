package com.homework.task2;

public class building {
    private static byte floors = 16;
    private static short entrance = 4;
    private static int room = 192;
    private static char symbol = 'N';
    private static String adress = "Avenue.63";
    private static double cost = 100.000;
    private static Integer i = 682;
    private static Double d = 3.85;
    private static Boolean bo = false;

    public static void main(String[] args) {
        int i = 5;
        byte b = (byte) i;
        char g = (char) b;
        long l = 8888;
        float f = l;
        boolean values = true;
        char number = 'f';
        int a = number;
        byte w = 8;
        short d = (byte) w;
        float z = 3.258f;
        double j = (float) z;
        Short s = 94;

        Sale Sale = new Sale();

        System.out.println(Sale.getAdress());
        System.out.println(b);
        System.out.println(g);
        System.out.println(l);
        System.out.println(values);
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
        System.out.println(s);
        System.out.println(l);
        System.out.println(s);

    }

}