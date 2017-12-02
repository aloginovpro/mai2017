package ru.mai.learning.classes.generics.tree;

import ru.mai.learning.classes.generics.Car;

public class Tree<V extends Comparable<V>> {

    Node<V> root;
    int arrSize = 0;

    void buildTree(V[] arr) {
        for (V element : arr) {
            add(element);
        }
        arrSize = arr.length;
    }

    void add(V x) {
        Node<V> newNode = new Node<V>(x);
        if (root == null) {
            this.root = newNode;
        } else {
            add(newNode, root);
        }
    }

    void add(Node<V> newNode, Node<V> node) {
        if (newNode.value.compareTo(node.value) >= 0) {
            if (node.right == null) {
                node.right = newNode;
            } else {
                add(newNode, node.right);
            }
        } else {
            if (node.left == null) {
                node.left = newNode;
            } else {
                add(newNode, node.left);
            }
        }
    }

    void printAll() {
        if (root == null) {
            System.out.println("tree is empty");
        } else {
            print(root);
        }
    }

    void print(Node node) {
        if (node.left != null) {
            print(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            print(node.right);
        }
    }

    int fillArray(int counter, V[] result, Node<V> node) {
        if (node.left != null) {
            counter = fillArray(counter, result, node.left);
        }
        result[counter] = node.value;
        counter++;
        if (node.right != null) {
            return fillArray(counter, result, node.right);
        } else {
            return counter;
        }
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car(50, "Moscvich"),
                new Car(60, "Lada"),
                new Car(50, "Merc")
        };
        Tree<Car> tree = new Tree<Car>();
        tree.buildTree(cars);
        tree.printAll();
    }

    public static void main1(String[] args) {
        Integer[] arr = new Integer[] { 4, 7, 3, 1, 5, 3, 8, 5, 1 };
        Tree<Integer> tree = new Tree<Integer>();
        tree.buildTree(arr);
        tree.printAll();
    }

    private static class Node<T extends Comparable<T>> {

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


}
