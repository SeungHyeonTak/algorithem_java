package com.programmers.level1;

// 가운데 글자 가져오기
public class MiddleLetter {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        if (s.length() % 2 == 0) {
            n = s.length() / 2;
            answer += s.substring(n - 1, n + 1);
        } else {
            n = s.length() / 2;
            answer += s.substring(n, n + 1);
        }

        return answer;
    }
}
