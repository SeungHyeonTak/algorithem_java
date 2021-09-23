package com.data_structure.DoubleLinkedList;

class Node<T> {
    T data;
    Node<T> prev = null;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class ExDLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public ExDLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }

            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.getData() == isData) {
                    return node.getData();
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.getData() != isData) {
                    return node.getData();
                } else {
                    node = node.prev;
                }
            }
        }
        return null;
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.getData());
            while (node.next != null) {
                node = node.next;
                System.out.println(node.getData());
            }
        }
    }

    public static void main(String[] args) {
        ExDLinkedList<Integer> dl = new ExDLinkedList<>();
        dl.addNode(1);
        dl.addNode(2);
        dl.addNode(3);
        dl.addNode(4);
        dl.addNode(5);
        dl.addNode(6);
        dl.printAll();

        System.out.println("====");
        System.out.println(dl.searchFromHead(2));
        System.out.println(dl.searchFromTail(5));
    }
}
