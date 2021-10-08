package com;

import com.programmers.level1.WorkoutClothes;

public class Main {
    public static void main(String[] args) {
        WorkoutClothes wc = new WorkoutClothes();
        int n = 5;
        int[] lost = {2, 4};
//        int[] lost = {2, 1};
//        int[] lost = {4, 2};
        int[] reserve = {1, 3, 5};
//        int[] reserve = {2, 3};
//        int[] reserve = {3, 5};
        wc.solution(n, lost, reserve);
    }
}
