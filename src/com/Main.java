package com;

import com.programmers.level1.MockTest;

public class Main {
    public static void main(String[] args) {
        MockTest mt = new MockTest();
        int[] answers = {1, 2, 3, 4, 5};
//        int[] answers = {1, 3, 2, 4, 2};
//        int[] answers = {5, 5, 5, 1, 4, 1};
//        int[] answers = {1, 1, 1, 1};
        mt.solution(answers);
    }
}
