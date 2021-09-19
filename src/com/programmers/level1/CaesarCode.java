package com.programmers.level1;

// 시저암호
public class CaesarCode {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ascii = s.charAt(i);

            if (ascii >= 'a' && ascii <= 'z') {
                if (ascii + n > 'z') {
                    answer.append((char) (ascii + n - 26));
                } else {
                    answer.append((char) (ascii + n));
                }
            } else if (ascii >= 'A' && ascii <= 'Z') {
                if (ascii + n > 'Z') {
                    answer.append((char) (ascii + n - 26));
                } else {
                    answer.append((char) (ascii + n));
                }
            } else {
                answer.append((char) ascii);
            }
        }
        return answer.toString();
    }
}
