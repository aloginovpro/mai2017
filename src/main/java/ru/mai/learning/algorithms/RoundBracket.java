package ru.mai.learning.algorithms;



//cd /Users/user/IdeaProjects/learning/target/classes
//java ru.mai.learning.algorithms.RoundBracket "(())"
public class RoundBracket {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Need one arg");
            System.exit(0);
        }
        String line = args[0];
        System.out.println(isCorrect(line));
    }

    static boolean isCorrect(String line) {
        int sum = 0;
        for (char c : line.toCharArray()) {
            if (c == '(') {
                sum++;
            } else {
                sum--;
            }
            if (sum < 0) {
                return false;
            }
        }
        return sum == 0;
    }

}
