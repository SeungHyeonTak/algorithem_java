package com.programmers.level1;

import java.util.HashMap;

// 완주하지 못한 선수
public class PlayerNotFinishRace {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hash.put(participant[i], hash.getOrDefault(participant[i], 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            hash.put(completion[i], hash.get(completion[i])-1);
        }

        for (String str: hash.keySet()) {
            if (hash.get(str) != 0) answer = str;
        }
        return answer;
    }
}
