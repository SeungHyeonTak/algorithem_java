package com.programmers.level1;

// 정수 제곱근 판별
public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        answer = (long) Math.sqrt(n);
        if (Math.pow(answer, 2) != n) return -1;
        answer = (long) Math.pow(answer + 1, 2);
        return answer;
    }
}
