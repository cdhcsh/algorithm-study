package study.algorithm.programmers;

import java.util.HashMap;

public class P0047 {
    public static void start() {
        P0047 obj = new P0047();
        String word = "EUIU";
        int result = obj.solution(word);
        System.out.println(result);
    }

    public int solution(String word) {
        int answer = 0;
        int[] cha = {781,156,31,6,1};//이전 이동 *5 + 1
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('E', 1);
        map.put('I', 2);
        map.put('O', 3);
        map.put('U', 4);

        char[] word_arr = word.toCharArray();
        answer += word_arr.length; // 길이만큼의 최소 순서

        int k=0;
        for(int i=0; i<word_arr.length; i++) {
            answer += cha[k++]*map.get(word_arr[i]); // 각 칸의 이동횟수 만큼 곱하여 더한다.
        }
        return answer;
    }
}
