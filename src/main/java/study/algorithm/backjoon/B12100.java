package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B12100 {
    static int[][] arr;
    static int[] check;
    static int N;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        move(1, arr);
        move(0, arr);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();

    }

    public static void solve(int n) {
        if (N == n) {
            answer = 1;
            return;
        }
        for (int i = 0; i < 4; i++) {
            check[n] = i;
            solve(n++);
        }
    }

    //    public static int calc(){
//        int[][] temp = arr.clone();
//    }
    public static void move(int t, int[][] map) {
        if (t == 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < N; j++) {
                    if (map[i][j] == 0) {
                        continue;
                    } else if (map[i][j] == map[i][j - 1]) {
                        map[i][j - 1] *= 2;
                        map[i][j] = 0;
                    } else {
                        map[i][j - 1] = map[i][j];
                        map[i][j] = 0;
                    }
                }
            }
        } else if (t == 1) {
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j > 0; j--) {
                    if (map[i][j] == 0) {
                        map[i][j] = map[i][j - 1];
                        map[i][j++ - 1] = 0;
                        continue;
                    }
                    if (map[i][j] == map[i][j - 1]) {
                        map[i][j] *= 2;
                        map[i][j - 1] = 0;
                    }
                }
            }
        }
    }
}
