package com.programmers.level1;

// 짝수와 홀수
public class EvenAndOdd {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
