package com.data_structure.array;

import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s_arr = new String[sc.nextInt()];

        for (int i = 0; i < s_arr.length; i++) {
            s_arr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < s_arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < s_arr[i].length(); j++) {
                if (s_arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }

    }
}
