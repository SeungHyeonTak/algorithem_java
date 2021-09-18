package com.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

// 정수 내림차순으로 배치하기
public class DescendingOrder {
    public long solution(long n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        Arrays.sort(strArr);
        Collections.reverse(Arrays.asList(strArr));
        str = String.join("", strArr);
        return Long.parseLong(str);
    }
}
