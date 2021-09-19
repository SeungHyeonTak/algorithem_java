package com.data_structure.LinkedList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }
}

public class ExLinkedList2<T> {
    private Node<T> head;

    public ExLinkedList2() {
        head = null;
    }

    // 노드 마지막에 추가
    // 순차접근 해야함
    public void insertNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> tempNode = head;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = head;
            System.out.println(node.getData());
            while (node.next != null) {
                node = node.next;
                System.out.println(node.getData());
            }
        }
    }

    public static void main(String[] args) {
        ExLinkedList2<Integer> el = new ExLinkedList2<>();

        el.insertNode(1);
        el.insertNode(2);
        el.insertNode(3);
        el.printAll();
    }
}
