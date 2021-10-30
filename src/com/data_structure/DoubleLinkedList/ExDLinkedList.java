package com.data_structure.DoubleLinkedList;

class Node<T> {
    T data;
    Node<T> prev = null;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}

public class ExDLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public void addNode(T data) {
        // 맨 뒤에 노드 추가
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public T searchFromHead(T isData) {
        // 앞에서 부터 노드 찾기
        if (this.head == isData) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) return node.data;
                else node = node.next;
            }
        }
        return null;
    }

    public T searchFromTail(T isData) {
        // 뒤에서 부터 노드 찾기
        if (this.head == isData) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) return node.data;
                else node = node.prev;
            }
        }
        return null;
    }

    public boolean insertToFront(T existedData, T addData) {
        // 기존 노드의 앞에 추가해주는 메서드
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> nodePrev = node.prev;

                    nodePrev.next = new Node<>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                } else {
                    node = node.next;
                }
            }
        }
        return false;
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        ExDLinkedList<Integer> list = new ExDLinkedList<>();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.addNode(9);
        list.addNode(11);
        list.printAll();
        System.out.println("====");
        list.insertToFront(3, 2);
        list.printAll();
//        System.out.println(list.searchFromHead(9));
//        System.out.println(list.searchFromTail(5));
    }
}
