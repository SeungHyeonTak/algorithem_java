package com.programmers.level1;

import java.util.ArrayList;

// 제일 작은 수 제거하기
public class RemoveSmallNumbers {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            ArrayList<Integer> answer = new ArrayList<>();
            int[] iArr = {};
            int num = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                if (num > arr[i + 1]) {
                    num = arr[i + 1];
                }
            }

            for (int j : arr) {
                if (num != j) {
                    answer.add(j);
                }
            }

            iArr = answer.stream().mapToInt(Integer::intValue).toArray();
            return iArr;
        }
    }
}
