package com.programmers.level1;

import java.util.Arrays;

// 예산
public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result <= budget) answer = i + 1;
        }
        return answer;
    }
}
