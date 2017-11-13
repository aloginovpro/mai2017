package ru.mai.learning.primitives;

public class Loop {

    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);


        //fori
        for (int i = 0; i < 5; i++) { //init; condition; increment
            System.out.println(i);
        }
    }

    public static void main2(String[] args) {
        int x = 0;
        outerLoop:
        while (x < 3) {
            int y = 0;
            while (y < 5) {
                int m = x * y;
                System.out.println(m);
                if (m == 4) {
                    break outerLoop;
                }
                y++;
            }
            x++;
        }
    }

    public static void main1(String[] args) {

        int i = 1;
        while (i < 20) {
            i++;
            if (i % 6 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("finished");
    }

}
