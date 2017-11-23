package ru.mai.learning.classes.list;

public class LinkedList {

    Node root = null;

    void add(Cat cat) {
        Node newNode = new Node(cat);
        if (root == null) {
            root = newNode;
        } else {
            Node last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int size() {
        if (root == null) {
            return 0;
        }
        int counter = 0;
        Node current = root;
        do {
            counter++;
        } while ((current = current.next) != null);
        return counter;
    }

    void printAll() {
        if (root == null) {
            System.out.println("list is empty");
        } else {
            Node current = root;
            do {
                System.out.println(current.value.name);
            } while ((current = current.next) != null);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Cat("cat1"));
        list.add(new Cat("cat2"));
        list.add(new Cat("cat3"));
        list.printAll();
        System.out.println("size = " + list.size());
    }

}
