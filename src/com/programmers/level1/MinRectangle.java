package com.programmers.level1;

// 최소 직사각형
public class MinRectangle {
    public int solution(int[][] sizes) {
        int answer;
        int lenResult = 0;
        int widthResult = 0;
        int[][] edge = new int[sizes.length][2];

        for (int i = 0; i < sizes.length; i++) {
            int temp = sizes[i][0];
            for (int j = 0; j < 2; j++) {
                if (temp > sizes[i][j]) {
                    edge[i][0] = temp;
                    edge[i][1] = sizes[i][j];
                } else {
                    edge[i][0] = sizes[i][j];
                    edge[i][1] = temp;
                }
            }
            if (lenResult < edge[i][0]) lenResult = edge[i][0];
            if (widthResult < edge[i][1]) widthResult = edge[i][1];
        }
        answer = lenResult * widthResult;
        return answer;
    }
}
