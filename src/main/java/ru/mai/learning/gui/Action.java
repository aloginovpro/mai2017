package ru.mai.learning.gui;

import java.util.function.BiFunction;

public enum Action {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULT("*", (x, y) -> x * y),
    DIV("/", (x, y) -> x / y);

    public final String view;
    private final BiFunction<Integer, Integer, Integer> function;

    Action(String view, BiFunction<Integer, Integer, Integer> function) {
        this.view = view;
        this.function = function;
    }

    public int apply(int x, int y) {
        return function.apply(x, y);
    }

    /*
    public static int apply(int x, int y, Action action) {
        switch (action) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case MULT: return
        }
    }
    */

}
