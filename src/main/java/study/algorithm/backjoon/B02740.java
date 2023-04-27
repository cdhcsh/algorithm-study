package study.algorithm.backjoon;

/**
 * 행렬 곱셈
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02740 {
    static int[][] a;
    static int aN;
    static int aM;
    static int[][] b;
    static int bN;
    static int bM;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        aN = Integer.parseInt(st.nextToken());
        aM = Integer.parseInt(st.nextToken());
        a = new int[aN][aM];

        for (int i = 0; i < aN; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < aM; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        bN = Integer.parseInt(st.nextToken());
        bM = Integer.parseInt(st.nextToken());
        b = new int[bN][bM];

        for (int i = 0; i < bN; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < bM; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int w = aN;
        int h = bM;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                bw.write(multi(i,j)+" ");
            }
            bw.write("\n");
        }
        bw.close();


    }
    static int multi(int x,int y){
        int result = 0;
        for (int i = 0; i < aM; i++) {
            result+= a[x][i] * b[i][y];
        }
        return result;
    }
}
