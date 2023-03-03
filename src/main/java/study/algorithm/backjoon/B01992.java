package study.algorithm.backjoon;

/**
 * 쿼드 트리
 */

import java.io.*;

public class B01992 {
    static int map[][];
    static int d[][] = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        bw.write(find(n, 0, 0));
        bw.close();
    }

    static String find(int n, int x, int y) {
        if (n == 1) {
            return String.valueOf(map[x][y]);
        }
        int m = n / 2;
        boolean same = true;
        int tmp = map[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if(map[i][j]!=tmp){
                    same = false;
                    break;
                }
            }
        }
        if (same) return String.valueOf(map[x][y]);
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < 4; i++) {
            sb.append(find(m, x + d[i][0] * m, y + d[i][1] * m));
        }
        sb.append(")");
        return sb.toString();
    }
}
