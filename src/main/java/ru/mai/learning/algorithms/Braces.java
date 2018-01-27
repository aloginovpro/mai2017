package ru.mai.learning.algorithms;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Stack;

public class Braces {

    public static void main(String[] args) {
        System.out.println(check("([])"));
        System.out.println(check("([)]"));
        System.out.println(check("[(])"));
        System.out.println(check("("));
        System.out.println(check(")"));
        System.out.println(check("()()"));
    }

    static Map<Character, Character> braces = ImmutableMap.of(
            ')', '(',
            ']', '[',
            '}', '{'
    );
    static boolean check(String line) {
        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (!braces.containsKey(c)) { //opening
                stack.push(c);
            } else { //closing
                if (stack.isEmpty()) {
                    return false;
                }
                Character popped = stack.pop();
                Character opening = braces.get(c);
                if (!popped.equals(opening)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
