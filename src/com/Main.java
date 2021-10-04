package com;

import com.programmers.level1.Budget;

public class Main {
    public static void main(String[] args) {
        Budget bud = new Budget();
//        int[] d = {1, 3, 2, 5, 4};
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        bud.solution(d, budget);
    }
}
