package com.data_structure.LinkedList;


class SingleLinkedList<T> {
    public Node<T> head = null;

    // Node 클래스 구현
    public static class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    // node 연결
    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    // 데이터 출력
    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
}

public class ExLinkedList {
    public static void main(String[] args) {
        SingleLinkedList<Integer> sl = new SingleLinkedList<>();
        sl.addNode(1);
//        System.out.println(sl.head.data);
        sl.addNode(2);
//        System.out.println(sl.head.next.data);
        sl.addNode(3);
        sl.printAll();
    }
}
