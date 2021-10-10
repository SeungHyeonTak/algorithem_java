package com.programmers.level1;

import java.util.*;

// 모의고사
public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] student = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] result = new int[student.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (student[i][j % student[i].length] == answers[j]) result[i]++;
            }
        }

        int max = Math.max(result[0], Math.max(result[1], result[2]));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (max == result[i]) list.add(i + 1);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
