package study.algorithm.backjoon;

/**
 * 인사성 밝은 곰곰이
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int line = Integer.parseInt(br.readLine());
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < line; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")){
                answer += set.size();
                set.clear();
            }
            else{
                set.add(str);
            }
        }
        answer += set.size();
        System.out.println(answer);


    }
}
