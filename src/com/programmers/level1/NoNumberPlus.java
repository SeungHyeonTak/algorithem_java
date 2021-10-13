package com.programmers.level1;

// 없는 숫자 더하기
public class NoNumberPlus {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int number : numbers) answer += number;
        return 45 - answer;
    }
}
