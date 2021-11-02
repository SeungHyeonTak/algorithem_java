package com.programmers.level2;

import java.util.Arrays;
import java.util.Collections;

// 최솟값 구하기
public class MinimumValueCreate {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Integer[] bInt = new Integer[B.length];

        for (int i = 0; i < bInt.length; i++) bInt[i] = B[i];

        Arrays.sort(A);  // 오름차순
        Arrays.sort(bInt, Collections.reverseOrder());  // 내림차순

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * bInt[i];
        }

        return answer;
    }
}
