package study.algorithm.backjoon;

/**
 * 행운의 문자열
 */

import java.io.*;

public class B01342 {
    static int[] counts;
    static int N;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        N = str.length();
        counts = new int[26];
        for (int i = 0; i < N; i++) {
            counts[str.charAt(i)-'a']++;
        }
        dfs(0,-1);
        System.out.println(answer);

    }
    static void dfs(int n ,int pre){
        if(n == N){
            answer++;
        }
        for (int i = 0; i < 26; i++) {
            if(counts[i] > 0 && i != pre){
                counts[i]--;
                dfs(n+1,i);
                counts[i]++;
            }
        }
    }
}
