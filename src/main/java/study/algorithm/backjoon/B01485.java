package study.algorithm.backjoon;

/**
 * 정사각형
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] v = new int[4][2];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                v[j][0] = Integer.parseInt(st.nextToken());
                v[j][1] = Integer.parseInt(st.nextToken());
            }
            if(isSquare(v)) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.close();
        br.close();
    }
    static boolean isSquare(int[][] v){
        double[] d = new double[6];
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 4; j++) {
                d[c++] = getDistance(v[i],v[j]);
            }
        }
        Arrays.sort(d);
        for (int i = 0; i < 3; i++) {
            if(d[i]!=d[i+1]) return false;
        }
        return d[4] == d[5];
    }
    static double getDistance(int[] a,int[] b){
        return Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2);
    }
}
