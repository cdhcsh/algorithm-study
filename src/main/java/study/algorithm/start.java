package study.algorithm;

import study.algorithm.programmers.*;

import java.util.Stack;


public class start {
    public static void main(String[] args) {
//        System.out.println(P0007.solution2(new int[]{1,2,1,2,3,1,3,1}));
//        System.out.println(P0008.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
//        System.out.println(P0011.solution("10000","20300045"));
        System.out.println("{");
        for (int i : P0013.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}
                , 2)) {
            System.out.println(i);
        }
        System.out.println("}");
    }
}
