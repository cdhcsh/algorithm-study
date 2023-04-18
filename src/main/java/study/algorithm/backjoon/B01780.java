package study.algorithm.backjoon;

/**
 * 종이의 개수
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01780 {
    static int[] count = new int[3];
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken())+1;
            }
        }
        find(0,0,n);
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
    static void find(int x , int y , int n){
        if(check(x,y,n)){
            counting(x,y);
        }
        else {
            for (int i = x; i < x+n; i+=(n/3)) {
                for (int j = y; j < y+n; j+=(n/3)) {
                    find(i,j,n/3);
                }
            }
        }

    }
    static void counting(int x,int y){
        count[paper[x][y]]++;
    }
    static boolean check(int x , int y , int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(paper[x][y] != paper[x+i][y+j])
                    return false;
            }
        }
        return true;
    }
}
