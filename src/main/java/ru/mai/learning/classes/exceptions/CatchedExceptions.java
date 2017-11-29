package ru.mai.learning.classes.exceptions;

import java.util.concurrent.TimeoutException;

public class CatchedExceptions {

    public static void main(String[] args) {
        try {
            doSmt();
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
        System.out.println("after exception");
    }

    static void doSmt() throws TimeoutException {
        throw new TimeoutException();
    }

}
