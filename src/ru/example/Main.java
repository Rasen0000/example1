package ru.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //System.exit(2);

        task1();
        task2();

    }

    public static byte task1() {
        byte a = 2;
        int b = 1002;
        System.out.println((byte) (a + b));
        return 0;
    }

    public static long task2() {
        int a = 21;
        long b = 222;
        System.out.println(a + b);
        return 0;
    }





}
