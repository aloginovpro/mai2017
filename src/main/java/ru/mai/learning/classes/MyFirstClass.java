package ru.mai.learning.classes;

public class MyFirstClass {

    public static void main(String[] args) {
/*
        int[] color = new int[10];
        int[] weight = new int[10]; //kg
        int[] medales = new int[10];

        color[0] = 5;
        weight[0] = 10;
        medales[0] = 5;

        color[1] = 5;
        weight[1] = 10;
        medales[1] = -1; //special value
*/
//object = instance of class
        Cat cat1 = new Cat("Barsik", 2);
//        cat1.name = "Rex";
        cat1.weight = 3;
        System.out.println(cat1.color);
        cat1.meow();

        Cat cat2 = new Cat("Liusya", 5);
        cat2.meow();

    }


}
