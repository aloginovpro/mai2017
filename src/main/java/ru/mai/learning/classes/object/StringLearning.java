package ru.mai.learning.classes.object;

public class StringLearning {

    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2p1 = "Hello ";
        String s2p2 = "world";
        String s2 = s2p1 + s2p2;
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = "Hello world";
        System.out.println(s1 == s3);
    }

    public static void main1(String[] args) {
        String[] strings = {"a", "123", "de", "45"};
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        String result = sb.toString();
        result = "a" + getLine() + "qwe";
    }

    static String getLine() {
        return "123";
    }

    public static void main2(String[] args) {
        String[] strings = {"a", "123", "de", "45"};
        String result = "";
        for (String s : strings) {
            result += s; //bad practice
        }
        System.out.println(result);
    }

}
