package com;

import com.programmers.level1.JobRecommendation;

public class Main {
    public static void main(String[] args) {
        JobRecommendation jr = new JobRecommendation();
        String[] table = {
                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };
//        String[] languages = {"PYTHON", "C++", "SQL"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
//        int[] preference = {7, 5, 5};
        int[] preference = {7, 5};
        jr.solution(table, languages, preference);
    }
}
