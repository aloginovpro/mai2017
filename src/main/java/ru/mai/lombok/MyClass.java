package ru.mai.lombok;

import lombok.*;

//@AllArgsConstructor @EqualsAndHashCode @ToString @Getter
@Data
public class MyClass {

//    private final String value;
//
//    public static void main(String[] args) {
//        MyClass myClass1 = new MyClass("abc");
//        MyClass myClass2 = new MyClass("abc");
//        System.out.println(myClass1.getValue());
//        System.out.println(myClass1.equals(myClass2));
//        System.out.println(myClass1);
public static void main(String[] args) {


        String ANSI_RED = "\u001B[31m" + "\u2600";
        System.out.println(ANSI_RED);
    }

}
