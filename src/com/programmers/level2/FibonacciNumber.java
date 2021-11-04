package com.programmers.level2;

public class FibonacciNumber {
    public int solution(int n) {
        int answer = 0;
        if (n == 1 || n == 2) return 1;

        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= n; i++) {
            answer = n1 + n2;
            answer %= 1234567;
            n1 = n2;
            n2 = answer;
        }
        return answer;
    }
}
