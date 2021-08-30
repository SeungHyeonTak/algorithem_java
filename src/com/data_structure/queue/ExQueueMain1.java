package com.data_structure.queue;

import java.util.ArrayList;

public class ExQueueMain1<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // enqueue, dequeue 기능 구현해보기
        // dequeue 기능 호출 시 큐에 데이터가 없을 경우 null return
        ExQueueMain1<Integer> eq = new ExQueueMain1<Integer>();
        eq.enqueue(1);
        eq.enqueue(2);
        eq.enqueue(3);
        System.out.println(eq.dequeue());
        System.out.println(eq.dequeue());
        System.out.println(eq.dequeue());
    }


}
