package study.algorithm.backjoon;

/**
 * 별찍기 - 10
 */

import java.io.*;

public class B02447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        draw(arr, 0, 0, n, '*');
        for (char[] chars : arr) {
            for (char c : chars) {
                bw.write(c);
            }
            bw.write("\n");
        }
        bw.close();

    }

    static void draw(char[][] arr, int x, int y, int n, char c) {
        if (c == ' ') {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i + x][j + y] = ' ';
                }
            }
            return;
        } else if (n == 1) {
            arr[x][y] = c;
            return;
        }
        int p = 1;
        int d = n/3;
        for (int i = 0; i < n; i+=d) {
            for (int j = 0; j < n; j+=d){
                if(p++==5) draw(arr,x+i,y+j,d,' ');
                else draw(arr,x+i,y+j,d,'*');
            }
        }
    }
}
