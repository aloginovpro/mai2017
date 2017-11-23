package ru.mai.learning.classes.visibility;

public class TextUtils {

    public static int c = 10;

    public static void prettyPrint(String s) {
        System.out.println("---===" + s + "===---");
    }

    public static void main(String[] args) {
        TextUtils.prettyPrint("hello");
    }

}
