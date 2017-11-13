package ru.mai.learning.primitives;

public class Primitives {

    public static void main(String[] args) {
        long a = 1000000000000L;
        int b = 20;

        int seconds = 15000000;
        long ms = seconds * 1000L;
        System.out.println(ms);

//        a = b; //auto casting
//        b = (int) a; //manual casting
//        System.out.println(a + " " + b);

        //auto casting: byte -> short -> int -> long
        //float -> double
        //integer -> float, double

        double f = a;
//        float d = 10.0f;
//        long e = d;


    }

    public static void main1(String[] args) {
        int a; //definition
        a = 1; //assignment, 1 - literal
//        System.out.println(a);

        int b = 5;
        b = 10;
//        System.out.println(b);

        byte c = 127; //-128 .. 127
        short d = 1; //-2^15 .. 2^15 - 1
        int e = 1; //-2^31 .. 2^31 - 1
        long f = 1; //-2^63 .. 2^63 - 1

        System.out.println(c);
        c++; //increment
        c++;
        c--; //decrement
        System.out.println(c);


        a = 2 * 2;
        a = 3 - 5 + 4;
        a = (2 + 3) * 2; //evaluation order -> operator priority

        a = 5 / 3; //integer division
        System.out.println(a); //1

        int modulus = 5 % 3;
        System.out.println(modulus); // 2

        float g = 10.0f; //4 byte
        double h = 3.14; //8 byte

        boolean j = true;
        j = false;

        j = (a == 1);
        System.out.println(j);

        //AND, OR, XOR, NOT - и, или, либо, не
        j = true | false; //OR
        j = true & false; //AND
        j = !true; //NOT

        j = (a > 0) & a != 7;

        char k = 'a'; //2 byte

    }
}
