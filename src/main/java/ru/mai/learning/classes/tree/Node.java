package ru.mai.learning.classes.tree;

public class Node {

    final int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
