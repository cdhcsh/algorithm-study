package study.algorithm;

import study.algorithm.programmers.*;

import java.util.Arrays;


public class start {
    public static void main(String[] args) {
//        System.out.println(P0007.solution2(new int[]{1,2,1,2,3,1,3,1}));
//        System.out.println(P0008.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
//        System.out.println(P0011.solution("10000","20300045"));
//        System.out.println(P0026.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"));
//        System.out.println(P0027.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[]{1,5,3,5,1,2,1,4}));
//        System.out.println(P0028.solution("500220839878","7"));
        int [] result = P0029.solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        Arrays.stream(result).forEach(System.out::println);
//        System.out.println(P0028.solution("3141592","271"));
    }
}
