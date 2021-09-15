package com.programmers.level1;

import java.io.*;
import java.util.StringTokenizer;


// 직사각형 별찍기
public class RectangularStar {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writ = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = read.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                writ.write("*");
            }
            writ.newLine();
        }
        writ.flush();
        writ.close();
    }
}
