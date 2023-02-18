package study.algorithm.backjoon;

/**
* N과 M(5)
*/

import java.io.*;
import java.util.*;

public class B15654 {
    static BufferedWriter bw = null;
    static int N;
    static int M;
    static int[] nums;
    static int[] visit;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new int[N];
        nums = new int[N];
        answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        dfs(0);
        bw.close();

    }

    static void dfs(int n) throws IOException {
        if (n == M) {
            print();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (visit[i - 1] == 0) {
                visit[i - 1] = 1;
                answer[n] = nums[i-1];
                dfs(n + 1);
                visit[i - 1] = 0;
            }
        }

    }

    static void print() throws IOException {
        for (int i = 0; i < answer.length; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
    }

}
