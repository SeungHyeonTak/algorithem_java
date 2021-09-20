package com.data_structure.LinkedList;

class Node4<T> {
    T data;
    Node4<T> next;

    public Node4(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }
}

public class ExLinkedList4<T> {
    private Node4<T> head;

    public ExLinkedList4() {
        head = null;
    }

    // 마지막에 노드 삽입
    public void insertNode(T data) {
        Node4<T> newNode = new Node4<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node4<T> tempNode = head;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
        }
    }

    // 중간 노드 삽입
    public void insertNode(T data, T isData) {
        Node4<T> preNode = this.searchNode(isData);

        if (preNode == null) {
            this.insertNode(data);
        } else {
            Node4<T> newNode = new Node4<>(data);
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
    }

    // 노드 검색
    public Node4<T> searchNode(T data) {
        if (head == null) {
            return null;
        } else {
            Node4<T> node = head;
            while (node.next != null) {
                if (node.data == data) return node;
                else node = node.next;
            }
            return null;
        }
    }

    // 마지막 노드 제거
    public void deleteNode() {
        Node4<T> preNode;
        Node4<T> tempNode;

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

    // 중간 노드 삭제
    public void deleteNode(T data) {
        Node4<T> preNode = head;
        Node4<T> tempNode = preNode.next;

        if (data.equals(preNode.getData())) {
            head = preNode.next;
            preNode.next = null;
        } else {
            while (tempNode != null) {
                if (data.equals(tempNode.getData())) {
                    if (tempNode.next == null) {
                        preNode.next = null;
                    } else {
                        preNode.next = tempNode.next;
                        tempNode.next = null;
                    }
                    break;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.next;
                }
            }
        }
    }

    // 전체 나열
    public void printAll() {
        if (head != null) {
            Node4<T> node = head;
            System.out.println(node.getData());
            while (node.next != null) {
                node = node.next;
                System.out.println(node.getData());
            }
        }
    }

    public static void main(String[] args) {
        ExLinkedList4<Integer> el = new ExLinkedList4<>();
        el.insertNode(1);
        el.insertNode(3);
        el.insertNode(4);
        el.insertNode(5);
        el.printAll();
        System.out.println("==========");
        System.out.println("중간 노드 삽입");
        el.insertNode(2, 1);
        el.insertNode(6, 5);
        el.insertNode(10, 11);
        el.printAll();
        System.out.println("==========");
        System.out.println("중간 노드 삭제");
        el.deleteNode(3);
        el.deleteNode(10);
        el.printAll();
        System.out.println("==========");
        el.deleteNode();
        el.deleteNode();
        el.deleteNode();
        el.printAll();
        System.out.println("==========");
    }
}
