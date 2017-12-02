package ru.mai.learning.classes.files;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        printDir(new File("/Users/user/IdeaProjects/learning/src/main/java/ru/mai/learning/classes"));
    }

    static void printDir(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printDir(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }

}
