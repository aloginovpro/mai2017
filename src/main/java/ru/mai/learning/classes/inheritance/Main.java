package ru.mai.learning.classes.inheritance;

public class Main {

    static void feedTheAnimal(Animal a) {
        a.eat();
    }

    public static void main(String[] args) {

        Animal cat = new Cat("c1", 5);
//        cat.miceCaught = 5;
//        Mouse catsFood = cat.whatEats();

        Dog dog = new Dog("d1");
        dog.isFighting = true;
        Meat dogsFood = dog.whatEats();

        cat.say();
        dog.say();


        /*
        Animal[] animals = new Animal[] {animal, cat, dog};
        for (Animal a : animals) {
            a.eat();
        }


        feedTheAnimal(new Cat("c1", 5));
        feedTheAnimal(new Dog("c2"));
        */
    }

}
