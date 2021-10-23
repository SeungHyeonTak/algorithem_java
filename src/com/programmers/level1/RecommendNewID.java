package com.programmers.level1;

// 신규 아이디 추천
public class RecommendNewID {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(); // 1단계 대문자 -> 소문자 치환

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            char n = new_id.charAt(i);
            if (('0' <= n && n <= '9') || ('-' == n) || ('_' == n) || ('.' == n) || ('a' <= n && n <= 'z')) {  // 2단계
                sb2.append(new_id.split("")[i]);
            }
        }

        // 3단계 . 처리
        String sb3 = "";
        sb3 = sb2.toString().replace("..", ".");
        while (sb3.contains("..")) sb3 = sb3.replace("..", ".");

        // 4단계 .가 처음이나 마지막에 있으면 제거
        if (sb3.length() > 0)
            if (sb3.charAt(0) == '.') sb3 = sb3.substring(1);

        if (sb3.length() > 0)
            if (sb3.charAt(sb3.length() - 1) == '.') sb3 = sb3.substring(0, sb3.length() - 1);

        // 5단계 빈 문자열이면 a를 대입
        String sb5 = "";
        if (sb3.length() == 0) sb5 = "a";
        else sb5 = sb3;

        // 6단계 길이가 16자 이상이면 15개로 끊는다.
        StringBuilder sb6;
        if (sb5.length() > 15) {
            sb6 = new StringBuilder(sb5.substring(0, 15));
            if (sb6.charAt(0) == '.') sb6 = new StringBuilder(sb6.substring(1));
            if (sb6.charAt(sb6.length() - 1) == '.') sb6 = new StringBuilder(sb6.substring(0, sb6.length() - 1));
        } else {
            sb6 = new StringBuilder(sb5);
        }

        // 7단계
        while (sb6.length() < 3) sb6.append(sb6.charAt(sb6.length() - 1));

        answer = sb6.toString();

        return answer;
    }
}
