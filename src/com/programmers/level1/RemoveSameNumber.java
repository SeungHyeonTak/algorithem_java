package com.programmers.level1;

import java.util.ArrayList;

// 같은 숫자는 싫어
public class RemoveSameNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) al.add(arr[i]);
            else if (arr[i] != arr[i - 1]) al.add(arr[i]);
        }

        answer = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
}
