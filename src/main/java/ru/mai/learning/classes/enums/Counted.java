package ru.mai.learning.classes.enums;

public class Counted {

    CountedEnum myNumber() { //result: 1..3
        CountedEnum two = CountedEnum.TWO;
        return two;
//        return null;
    }

    public static void main(String[] args) {
        CountedEnum one = CountedEnum.ONE;
        CountedEnum two = CountedEnum.TWO;

        System.out.println(one == two);

//        for (CountedEnum e : CountedEnum.values()) {
//            System.out.println(e);
//        }

        CountedEnum one1 = CountedEnum.valueOf("ONE123123");
    }

}
