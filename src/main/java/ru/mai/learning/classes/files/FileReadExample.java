package ru.mai.learning.classes.files;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

public class FileReadExample {
    static File file = new File("/Users/user/IdeaProjects/learning/src/main/resources/document.txt");


    public static void main2(String[] args) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

    public static void main1(String[] args) throws IOException {
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            int val;
            while ((val = is.read()) != -1) {
                System.out.println((char) val);
            }
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main3(String[] args) throws IOException {
        try (InputStream is = new FileInputStream(file)) { //try-with-resources
            int val;
            while ((val = is.read()) != -1) {
                System.out.println((char) val);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = FileUtils.readLines(file, Charset.defaultCharset());
        for (String line : lines) {
            System.out.println(line);
        }
    }

}







