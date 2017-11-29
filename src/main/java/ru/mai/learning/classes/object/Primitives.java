package ru.mai.learning.classes.object;

public class Primitives {

    public static void main(String[] args) {
        boolean condition = true;
        Integer a = null;
        int b = 10;
        Integer result = condition ? a : b;
        System.out.println(result);
    }

    public static void main1(String[] args) {
        Integer a = 123456;
        Integer b = 123456;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 123;
        Integer d = 123;
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }

    public static void main2(String[] args) {
        Object someObject = getSomeObject(2);

        Integer a = 5; //auto boxing
        int b = a + 10; //auto unboxing // a.intValue();
        double d = a + 10.0; //Integer -> (unboxing) -> int -> (casting) -> double
        Double f = a + 10.0; //Integer -> int -> double -> Double
        System.out.println(b);
    }

    static Object getSomeObject(int i) {
        switch (i) {
            case 1: return new Car(12, 500);
            case 2 : return "nothing";
            default: return 10; //auto boxing : new Integer(10);
        }
    }

}
