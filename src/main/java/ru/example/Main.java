package ru.example;

import java.util.Objects;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //System.exit(2);

        isCharNumber();
        task9();
        task10();
        task11();
        task12();
    }

    public static byte task1(byte a, short b) {
        a = 2;
        b = 1002;
        System.out.println((byte) (a + b));
        return 0;
    }

    public static int task2(int a, long b) {
        a = 212;
        b = 22222222;
        System.out.println( a * b);
        return 0;
    }

    public static void getMaxNumber (int a, int b) {
        a = 100;
        b = 140;
        if (a>b){
            System.out.println("Максимум a = " + a);
        }
        else if (b>a){
            System.out.println("Максимум b = " + b);
        }
        else {
            System.out.println("Цифры равны");
        }

    }

    static int isCharA(char a, char A) {

        a = 'А';
        A = 'А';

        System.out.println(Objects.equals(a, A));
        return 0;
    }

    static int isCharNumber() {
        char ch = '2';
        System.out.println(isDigit(ch));
        return 0;
    }

    public static void task9() {

        for (int i=0; i<30;i++)
            System.out.println(Integer.toBinaryString(i));
    }

    public static void task10 () {
        int maxValue = Integer.MAX_VALUE;

        System.out.println(Integer.toBinaryString(maxValue));
        System.out.println(Integer.toBinaryString(maxValue + 1));
    }
    static int task11(){
        char ch = 'x';
        System.out.println(Character.digit(ch, 36));
        return 0;
    }

    static int task12(){
        int ch = 14;
        System.out.println(Character.forDigit(ch, 36));
        return 0;
    }



}



