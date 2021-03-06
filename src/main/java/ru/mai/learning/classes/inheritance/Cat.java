package ru.mai.learning.classes.inheritance;

public class Cat extends Animal implements Ironable {

    final int miceCaught;

    public Cat(String name, int miceCaught) {
        super(name);
        this.miceCaught = miceCaught;
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
/*    is final
    @Override
    void sleep() {
        System.out.println("never sleeps");
    }
    */

    @Override
    Mouse whatEats() {
        return new Mouse();
    }

    public void iron() {
        System.out.println("murr-murr");
    }
}
