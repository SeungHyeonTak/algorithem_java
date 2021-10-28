package com.programmers.level1;

import java.util.Arrays;

// k번째 수
public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = {};
        for (int i = 0; i < commands.length; i++) {
            int first_split = commands[i][0];
            int last_split = commands[i][1];
            int result_number = commands[i][2];
            for (int j = 0; j < array.length; j++) {
                temp = Arrays.copyOfRange(array, first_split - 1, last_split);
            }
            Arrays.sort(temp);
            answer[i] = temp[result_number - 1];
        }

        return answer;
    }
}
