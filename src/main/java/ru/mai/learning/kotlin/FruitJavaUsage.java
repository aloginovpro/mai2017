package ru.mai.learning.kotlin;

public class FruitJavaUsage {

    public static void main(String[] args) {
        FruitJava fruit = FruitJava.builder()
                .setColor("yellow")
                .setName("banana")
                .build();
    }

}
