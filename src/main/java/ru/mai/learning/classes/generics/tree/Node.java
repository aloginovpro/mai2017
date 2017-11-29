package ru.mai.learning.classes.generics.tree;

public class Node<T extends Comparable<T>> {

    final T value;
    Node left;
    Node right;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
