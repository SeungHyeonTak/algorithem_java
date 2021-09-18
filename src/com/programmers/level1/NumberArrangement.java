package com.programmers.level1;

import java.util.Arrays;

public class NumberArrangement {
    public long[] solution(long n) {
        String str = String.valueOf(n);
        long[] answer = new long[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = n % 10;
            n /= 10;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
