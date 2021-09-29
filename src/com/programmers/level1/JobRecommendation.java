package com.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 직업군 추천하기
public class JobRecommendation {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int result = 0;
        int dict = 91;

        for (String s : table) {
            int sum = 0;
            ArrayList<String> strArr = new ArrayList<>();
            Collections.addAll(strArr, s.split(" "));
            for (int k = 0; k < languages.length; k++) {
                if (strArr.contains(languages[k])) {
                    if (strArr.indexOf(languages[k]) == 1) sum += preference[k] * 5;
                    else if (strArr.indexOf(languages[k]) == 2) sum += preference[k] * 4;
                    else if (strArr.indexOf(languages[k]) == 3) sum += preference[k] * 3;
                    else if (strArr.indexOf(languages[k]) == 4) sum += preference[k] * 2;
                    else if (strArr.indexOf(languages[k]) == 5) sum += preference[k];
                }
            }

            if (result < sum) {
                result = sum;
                answer = strArr.get(0);
            } else if (result <= sum) {
                result = sum;
                if (dict > strArr.get(0).charAt(0)) {
                    dict = strArr.get(0).charAt(0);
                    answer = strArr.get(0);
                }
            }
        }
        return answer;
    }
}
