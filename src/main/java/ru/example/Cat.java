package ru.example;

public class Cat extends Animal {
    private int life;

    public Cat(int speed, int life) {
        super(speed);
        this.life = life;
    }


    @Override
    String Sound() {
        return "Мяу";
    }

    @Override
    Boolean Eat() {
        return super.Eat();
    }


    @Override
    Boolean Climb() {
        return true;
    }

    @Override
    Boolean Swim() {
        return false;
    }

    public Cat(){
        this(220, 9);
        System.out.println(super.Sound());
    }

    public int getLife() {
        return life;
    }
}
