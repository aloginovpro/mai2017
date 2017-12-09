package ru.mai.learning.classes.builder;

public class Usage {

    public static void main(String[] args) {
        Player vasya = Player.builder()
                .setId(10)
//                .setName("Vasya")
//                .setEmail("a@gmail.com")
                .build();

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.toString();
    }

}
