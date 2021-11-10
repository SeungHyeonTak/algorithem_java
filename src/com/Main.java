package com;

import com.programmers.level2.MatrixMultiplication;

public class Main {
    public static void main(String[] args) {
        MatrixMultiplication m = new MatrixMultiplication();
//        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
//        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] arr2 = {{1, 4}, {2, 5}, {3, 6}};
        m.solution(arr1, arr2);
    }
}
