package study.algorithm.backjoon;

/**
 * 친구
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B01058 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] friend = new char[N][N];
        boolean[][] arr = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                friend[i][j] = str.charAt(j);
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int t = 0;
            for (int j = 0; j < N; j++) {
                if(friend[i][j]=='Y') {
                    arr[i][j] = true;
                    for (int k = 0; k < N; k++) {
                        if(friend[j][k]=='Y') arr[i][k] = true;
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                if(i==j) continue;
                if(arr[i][j]) t++;
            }

            max = Math.max(max, t);
        }

        System.out.println(max);

    }
}
