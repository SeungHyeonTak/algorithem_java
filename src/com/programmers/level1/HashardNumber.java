package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 하샤드 수
public class HashardNumber {
    public boolean solution(int x) {
        boolean answer = true;
        String[] strArray = String.valueOf(x).split("");
        int n = 0;
        for (String s : strArray) {
            int sum = Integer.parseInt(s);
            n += sum;
        }
        if (x % n != 0) {
            answer = false;
        }
        return answer;
    }
}
