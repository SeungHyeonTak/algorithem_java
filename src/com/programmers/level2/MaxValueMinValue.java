package com.programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

// 최댓값과 최솟값
public class MaxValueMinValue {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.split(" ").length; i++) {
            arr.add(Integer.parseInt(s.split(" ")[i]));
        }

        int max = Collections.max(arr);
        int min = Collections.min(arr);

        answer = min + " " + max;

        return answer;
    }
}
