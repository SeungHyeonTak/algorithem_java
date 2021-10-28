package com;

import com.programmers.level1.Knumber;

public class Main {
    public static void main(String[] args) {
        Knumber k = new Knumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        k.solution(array, commands);

    }
}
