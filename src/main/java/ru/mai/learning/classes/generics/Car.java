package ru.mai.learning.classes.generics;

public class Car implements Comparable<Car> {

    final int price;
    final String brand;

    public Car(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    public int compareTo(Car o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(50, "moskvich");
        Car car2 = new Car(60, "lada");
        Car car3 = new Car(50, "merc");

        int comparison = car1.compareTo(car2);
        if (comparison > 0) {
            System.out.println("car1 > car2");
        } else if (comparison < 0) {
            System.out.println("car1 < car2");
        } else {
            System.out.println("car1 = car2");
        }

        CheapCarFilter filter = new CheapCarFilter();
        System.out.println(filter.suit(car2));

    }
}
