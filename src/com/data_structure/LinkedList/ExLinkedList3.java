package com.data_structure.LinkedList;

class Node3<T> {
    T data;
    Node3<T> next;

    public Node3(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

}

public class ExLinkedList3<T> {
    private Node3<T> head;

    public ExLinkedList3() {
        head = null;
    }

    // 마지막 리스트에 노드 추가
    public void insertNode(T data) {
        Node3<T> newNode = new Node3<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node3<T> tempNode = head;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
        }
    }

    // 마지막 노드 삭제
    public void deleteNode() {
        Node3<T> preNode;
        Node3<T> tempNode;

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            preNode = head;
            tempNode = preNode.next;

            while (tempNode.next != null) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            preNode.next = null;
        }
    }

    public void printAll() {
        if (head != null) {
            Node3<T> node = head;
            System.out.println(node.getData());

            while (node.next != null) {
                node = node.next;
                System.out.println(node.getData());
            }
        }
    }

    public static void main(String[] args) {
        ExLinkedList3<Integer> el = new ExLinkedList3<>();
        el.insertNode(1);
        el.insertNode(2);
        el.insertNode(3);
        el.insertNode(4);
        el.printAll();
        System.out.println("==============");
        el.deleteNode();
        el.deleteNode();
        el.printAll();
    }
}
