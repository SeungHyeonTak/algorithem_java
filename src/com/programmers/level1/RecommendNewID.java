package com.programmers.level1;

import java.util.ArrayList;
import java.util.Locale;

// 신규 아이디 추천
public class RecommendNewID {
    static final int RECOMMEND_STAGE = 7;

    public String solution(String new_id) {
        String answer = "";
        ArrayList<String> strList = new ArrayList<>();
        new_id = new_id.toLowerCase(); // 1단계 대문자 -> 소문자 치환

        for (int i = 0; i < new_id.length(); i++) {
            int n = new_id.charAt(i);
            if ((45 <= n && n <= 57) || (95 == n) || (97 <= n && n <= 122)) {  // 2단계
//                    System.out.println(strList);
                strList.add(new_id.split("")[i]);
            }
        }
        // . 처리
        // 특수문자 제거로 인해 문자열이 0이 될수도 2자 이하가 될수도있다.
        System.out.println(strList);

        return answer;
    }
}
