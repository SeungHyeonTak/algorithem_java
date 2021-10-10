package com.programmers.level1;

// 소수 만들기
public class MinorityMaking {
    public int solution(int[] nums) {
        int answer = 0;
        // 소수 구하는 법 : n-1까지의 수로 나눴을때 0으로 나눠 떨어지지 않는 수가 소수이다.

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int result = nums[i] + nums[j] + nums[k];
                    if (result >= 2) {
                        if (calculation(result)) {
                            answer++;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public boolean calculation(int result) {
        for (int i = 2; i < result; i++) {
            if (result % i == 0) return false;
        }
        return true;
    }
}
