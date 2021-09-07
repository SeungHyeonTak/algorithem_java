package com.data_structure.queue;

import java.util.ArrayList;

public class ExQueueMain2 {
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    public void enqueue(int data) {
        queue.add(data);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("값이 들어있지 않습니다.");
            return 0;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        ExQueueMain2 q = new ExQueueMain2();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
