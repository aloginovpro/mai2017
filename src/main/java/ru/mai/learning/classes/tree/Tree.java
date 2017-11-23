package ru.mai.learning.classes.tree;

public class Tree {

    Node root;
    int arrSize = 0;

    void buildTree(int[] arr) {
        for (int element : arr) {
            add(element);
        }
        arrSize = arr.length;
    }

    void add(int x) {
        Node newNode = new Node(x);
        if (root == null) {
            this.root = newNode;
        } else {
            add(newNode, root);
        }
    }

    void add(Node newNode, Node node) {
        if (newNode.value >= node.value) {
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

    int[] getSorted() {
        if (root == null) {
            return new int[0];
        }
        int[] result = new int[arrSize];
        fillArray(0, result, root);
        return result;
    }

    int fillArray(int counter, int[] result, Node node) {
        if (node.left != null) {
            counter = fillArray(counter, result, node.left);
        }
        result[counter] = node.value;
        counter++;
        if (node.right !=    null) {
            return fillArray(counter, result, node.right);
        } else {
            return counter;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[] { 4, 7, 3, 1, 5, 3, 8, 5, 1 };
        Tree tree = new Tree();
        tree.buildTree(arr);
//        tree.printAll();
        for (int e : tree.getSorted()) {
            System.out.println(e);
        }
    }

}
