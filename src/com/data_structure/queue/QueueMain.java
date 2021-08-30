package com.data_structure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        // 데이터 추가하기
//        System.out.println(queue_int.add(1));
//        System.out.println(queue_int.offer(2));
        queue_int.add(1);
        queue_int.offer(2);

        System.out.println(queue_int);

        queue_int.poll();  // 큐의 첫 번째 값 반환, 해당 값은 큐에서 삭제
        System.out.println(queue_int);
        queue_int.remove();  // poll()과 마찬가지로 첫 번째 값 반환하고 해당 값은 큐에서 삭제
        System.out.println(queue_int);
    }
}
