package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B01189 {
    static int R;
    static int C;
    static int K;

    static boolean map[][];
    static boolean visit[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new boolean[R][C];
        visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                map[i][j] = s[j] == 'T';
            }
        }


    }
    public static void solve(int x,int y){

    }
}
