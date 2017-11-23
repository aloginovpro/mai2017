package ru.mai.learning.classes.visibility;

public class ClassA {

    private int foo;

    private void bar() {
        foo = 5;
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.bar();

//        Singleton singleton = Singleton.INSTANCE;
//        Singleton singleton2 = Singleton.INSTANCE;
//        singleton.printHello();
        System.out.println(Singleton.class.getName());

        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
    }

}
