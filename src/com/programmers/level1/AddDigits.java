package com.programmers.level1;

// 자릿수 더하기 문제
public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
