package com.programmers.level1;

// 평균 구하기
public class FindAverage {
    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer/arr.length;
    }
}
