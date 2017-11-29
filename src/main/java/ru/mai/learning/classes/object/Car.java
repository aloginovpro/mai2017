package ru.mai.learning.classes.object;

public class Car {

    final int maxSpeed;
    final int price;

    public Car(int maxSpeed, int price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Car) { //true for Car and all inherited
//        if (obj != null && Car.class == obj.getClass()) { //true for Car only, not for inherited
            Car other = (Car) obj; //save after check
            return this.maxSpeed == other.maxSpeed;
        }
        return false;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return maxSpeed == car.maxSpeed;
    }

    public static void main(String[] args) {
        Car car1 = new Car(12, 500);
        Car car2 = new Car(12, 600);
//        System.out.println(car1 == car2); //reference comparison
        System.out.println(car1.equals(null));
    }

}
