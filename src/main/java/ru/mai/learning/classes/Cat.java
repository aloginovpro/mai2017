package ru.mai.learning.classes;

public class Cat {

    int weight = 10; //fields
    //final variable = constant
    final int color;
    final String name;

    Cat(String catsName, int catsColor) {
        color = catsColor;
        name = catsName;
    }

    void meow() { //method
        System.out.println(name + " meows!!!");
    }

}
