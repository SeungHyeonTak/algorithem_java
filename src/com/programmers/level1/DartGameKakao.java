package com.programmers.level1;

// 2018 카카오 블라인드 코테 (하) 다트 게임
public class DartGameKakao {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] arr = new int[3];
        String strTemp = "";

        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '*':
                    // 스타상
                    // 그 전의 수 들도 *2
                    arr[index - 1] *= 2;
                    if (index > 1) {
                        arr[index - 2] *= 2;
                    }
                    break;
                case '#':
                    // 아차상
                    arr[index - 1] *= -1;
                    break;
                case 'S':
                    arr[index] = (int) Math.pow(Integer.parseInt(strTemp), 1);
                    index++;
                    strTemp = "";
                    break;
                case 'D':
                    arr[index] = (int) Math.pow(Integer.parseInt(strTemp), 2);
                    index++;
                    strTemp = "";
                    break;
                case 'T':
                    arr[index] = (int) Math.pow(Integer.parseInt(strTemp), 3);
                    index++;
                    strTemp = "";
                    break;
                default:
                    // 점수 일때
                    strTemp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        for (int j : arr) {
            answer += j;
        }
        return answer;
    }
}
