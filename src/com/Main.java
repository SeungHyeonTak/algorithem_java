package com;

import com.programmers.level1.FailureRate;

public class Main {
    public static void main(String[] args) {
        FailureRate fr = new FailureRate();
        int n = 5;
//        int n = 4;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = {2, 1, 2, 4, 2, 4, 3, 3};
//        int[] stages = {4, 4, 4, 4, 4};
        fr.solution(n, stages);
    }
}
