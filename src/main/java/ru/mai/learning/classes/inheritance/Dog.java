package ru.mai.learning.classes.inheritance;

public class Dog extends Animal {

    boolean isFighting;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("woof");
    }

    @Override
    Meat whatEats() {
        return new Meat();
    }
}
