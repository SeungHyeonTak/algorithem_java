package com.programmers.level1;

import java.util.HashSet;

// 폰켓몬
public class Phonekemon {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) hashSet.add(i);

        answer = Math.min(hashSet.size(), nums.length / 2);
        return answer;
    }
}
