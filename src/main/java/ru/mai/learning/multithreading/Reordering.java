package ru.mai.learning.multithreading;

public class Reordering {
    /*

    t1:
    int a = 1
    boolean b = readBoolean()
    if (b)
      a = 2

    (a, b) = [ (1, false), (2, true) ]

    t1:
    int a = 2
    boolean b = readBoolean()
    if (!b)
      a = 1

    (a, b) = [ (1, false), (2, true) ]

    */
}
