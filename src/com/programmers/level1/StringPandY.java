package com.programmers.level1;

// 문자열 내 p와y의 개수
public class StringPandY {
    public boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.split("")[i].equals("p")) {
                count_p += 1;
            } else if (s.split("")[i].equals("y")) {
                count_y += 1;
            }
        }

        if (count_p != count_y) {
            answer = false;
        }
        return answer;
    }
}
