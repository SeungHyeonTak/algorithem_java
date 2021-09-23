package com.programmers.level1;

// 두 정수 사이의 합
public class SumBetweenTwoInteger {
    public long solution(int a, int b) {
        long answer = 0;
        int temp_a = 0;
        int temp_b = 0;

        if (a > b) {
            temp_a = b;
            temp_b = a;
        } else {
            temp_a = a;
            temp_b = b;
        }

        for (int i = temp_a; i <= temp_b; i++) {
            answer += i;
        }

        return answer;
    }
}
