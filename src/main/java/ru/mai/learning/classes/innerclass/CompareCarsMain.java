package ru.mai.learning.classes.innerclass;

import java.util.Comparator;

public class CompareCarsMain {

    public static void main(String[] args) {
        Car car1 = new Car(500, 120);
        Car car2 = new Car(600, 100);

        Comparator<Car> priceComparator = new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        };
        System.out.println(priceComparator.compare(car1, car2));
    }

//    private static class CarByPriceComparator implements Comparator<Car> {
//
//        public int compare(Car o1, Car o2) {
//            return o1.price - o2.price;
//        }
//    }

}
