package com;

import com.programmers.level1.MinRectangle;

public class Main {
    public static void main(String[] args) {
        MinRectangle mg = new MinRectangle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
//        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        mg.solution(sizes);
    }
}
