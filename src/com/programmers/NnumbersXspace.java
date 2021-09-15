package com.programmers;

// x만큼 간격이 있는 n개의 숫자
public class NnumbersXspace {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < n ;i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
