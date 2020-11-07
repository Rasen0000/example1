package ru.example;

public class Dog extends Animal {
    @Override
    String Sound() {
        return "Гав!";
    }

    @Override
    Boolean Eat() {
        return super.Eat();
    }



    @Override
    Boolean Climb() {
        return false;
    }

    @Override
    Boolean Swim() {
        return true;
    }

    public Dog(int speed) {
        super(speed);

        System.out.println(Sound());
    }
}
