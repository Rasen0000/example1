package ru.example;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat();

    @org.junit.jupiter.api.Test
    void getLife() {
        assertEquals(9, cat.getLife());
    }
}