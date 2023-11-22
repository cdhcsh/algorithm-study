package study.algorithm.backjoon;

/**
 * 줄세우기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = solve(st);
            bw.write(n + " " + m + "\n");
        }
        bw.close();

    }

    public static int solve(StringTokenizer st) {
        int[] arr = new int[20];
        int answer = 0;
        for (int i = 0; i < 20; i++) {
            int t = Integer.parseInt(st.nextToken());
            arr[i] = t;
            for (int j = 0; j < i; j++) {
                if (arr[j] > t) {
                    for (int k = i; k > j; k--) {
                        answer++;
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = t;
                    break;
                }
            }
        }
        return answer;
    }
}
