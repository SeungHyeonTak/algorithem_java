package com.data_structure.LinkedList;

class NodeClass<T> {
    T data;
    NodeClass<T> next;

    public NodeClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class LinkedListTest<T> {
    private NodeClass<T> head;

    public LinkedListTest() {
        head = null;
    }

    // 노드 데이터 검색
    public NodeClass<T> searchNode(T data) {
        if (head == null) {
            return null;
        } else {
            NodeClass<T> node = head;
            while (node.next != null) {
                if (data.equals(node.getData())) return node;
                else node = node.next;
            }
            return null;
        }
    }

    // 노드 마지막에 삽입
    public void insertNode(T data) {
        NodeClass<T> newNode = new NodeClass<>(data);

        if (head == null) {
            head = newNode;
        } else {
            NodeClass<T> tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    // 중간에 노드 삽입
    public void insertNode(T data, T preData) {
        NodeClass<T> search = this.searchNode(preData);

        if (search == null) {
            this.insertNode(data);
        } else {
            NodeClass<T> newNode = new NodeClass<>(data);
            newNode.next = search.next;
            search.next = newNode;
        }
    }

    // 마지막 노드 삭제
    public void deleteNode() {
        NodeClass<T> preNode;
        NodeClass<T> tempNode;

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
        NodeClass<T> preNode = head;
        NodeClass<T> tempNode = preNode.next;

        if (data.equals(preNode.getData())) {
            head = preNode.next;
            preNode.next = null;
        } else {
            while (tempNode.next != null) {
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

    public void printAll() {
        if (head != null) {
            NodeClass<T> node = head;
            System.out.println(node.getData());
            while (node.next != null) {
                node = node.next;
                System.out.println(node.getData());
            }
        }
    }

    public static void main(String[] args) {
        LinkedListTest<String> link = new LinkedListTest<>();
        System.out.println("링크드 리스트 Test");
        link.insertNode("a");
        link.insertNode("c");
        link.insertNode("e");
        link.printAll();
        System.out.println("=======");
        link.insertNode("b", "a");
        link.insertNode("d", "c");
        link.printAll();
        System.out.println("=======");
        link.deleteNode();
        link.deleteNode();
        link.printAll();
        System.out.println("=======");
        link.deleteNode("b");
        link.printAll();
    }
}
