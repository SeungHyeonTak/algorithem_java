package com.data_structure.array;

import java.util.Arrays;
import java.util.ArrayList;

public class StudyArray {
    public static void main(String[] args) {
        Integer[] data_list = new Integer[10]; // new를 사용해서 배열 선언
        data_list[0] = 1; // 인덱스를 선택해서 값을 넣을 수 있음
        System.out.println("test1 : " + data_list[0]);

        Integer[] data_list1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(data_list1));

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        System.out.println(list1.get(0));
        list1.set(0, 5);
        System.out.println(list1.get(0));
        System.out.println(list1.size());
        System.out.println(list1.remove(0));
        System.out.println(list1.get(0));
        System.out.println(list1.size());

        Integer[][] data_list3 = {{6, 5, 4}, {3, 2, 1}};

        System.out.println(data_list3[0][1]);

        Integer[][][] data_list4 = {
                {
                        {10, 9, 8},
                        {7, 6, 5}
                },
                {
                        {4, 3, 2},
                        {1, 11, 12}
                }
        };

//        System.out.println(data_list4[0][0][1]);  // 첫 배열에서 그 다음 첫 배열의
//        System.out.println(data_list4[1][1][1]);  // 두번째 배열의 두번째 인덱스의 값을 출력 (데이터 2의 index)
//
//        System.out.println(data_list4[0][0][2]);
//        System.out.println(data_list4[0][0][0]);
//        System.out.println(data_list4[1][0][2]);

        // Test
        String[] dataSet = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. Jone Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr.William Henry",
                "Moran, Mr.James",
                "McCarthy, Mr Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, r. Lalio"
        };
        // 문자 M을 가지고 있는 아이템의 수를 출력해보기
        int count = 0;
        // 기존 for loop
//        for (int item = 0; item < dataSet.length; item++) {
//            if (dataSet[item].indexOf("M") >= 0) {
//                count++;
//            }
//        }
        // 향상된 for
        for (String item : dataSet) {
//            if (item.indexOf("M") > -1) {
//                count++;
//            }
            if (item.contains("M")) {
                count++;
            }
        }
        System.out.println("M의 갯수 : " + count);

    }
}
