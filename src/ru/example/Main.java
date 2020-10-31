package ru.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //System.exit(2);

        task1();
        task2();
        getMaxNumber();
        isCharA();

    }

    public static byte task1() {
        byte a = 2;
        short b = 1002;
        System.out.println((byte) (a + b));
        return 0;
    }

    public static int task2() {
        int a = 212;
        long b = 22222222;
        System.out.println( a * b);
        return 0;
    }

    public static void getMaxNumber () {
        int a = 100;
        int b = 140;
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

    public static boolean isCharA() {
        char a = 'А';
        switch (a){
            case 'A': return true;
            default:
                return false;
        }

    }

}
