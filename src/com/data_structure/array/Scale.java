package com.data_structure.array;

import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        // 백준 - 음계 2920
        Scanner sc = new Scanner(System.in);
        Integer[] i_arr = new Integer[8];

        int a = 0;
        int d = 0;
        for (int i = 0; i < i_arr.length; i++) {
            i_arr[i] = sc.nextInt();

            if (i_arr[i] == i + 1) {
                a++;
            } else if (i_arr[i] == 8 - i) {
                d++;
            }
        }
        sc.close();

        if (a == 8) {
            System.out.println("ascending");
        } else if (d == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
