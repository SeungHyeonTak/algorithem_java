package com;

import com.programmers.level1.MutualEvaluation;

public class Main {
    public static void main(String[] args) {
        MutualEvaluation me = new MutualEvaluation();
//        int[][] scores = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
//        int[][] scores = {{50, 90}, {50, 87}};
        int[][] scores = {{75, 50, 100}, {75, 100, 20}, {100, 100, 20}};
//        int[][] scores = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        me.solution(scores);
    }
}
