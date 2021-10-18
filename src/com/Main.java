package com;

import com.programmers.level1.PressKeypad;

public class Main {
    public static void main(String[] args) {
        PressKeypad pk = new PressKeypad();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        pk.solution(numbers, hand);
    }
}
