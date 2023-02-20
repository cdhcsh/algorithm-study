package study.algorithm.backjoon;

/**
 * 신나는 함수 실행
 */

import java.io.*;
import java.util.StringTokenizer;

public class B09184 {
    static int[][][] w = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                for (int k = 0; k < w[i][j].length; k++) {
                    if(i<=0 || j<= 0 || k<= 0)
                        w[i][j][k] = 1;
                    else if (i < j && j < k)
                        w[i][j][k] = w[i][j][k-1] + w[i][j-1][k-1] - w[i][j-1][k];
                    else
                        w[i][j][k] = w[i-1][j][k]+ w[i-1][j-1][k]+ w[i-1][j][k-1] - w[i-1][j-1][k-1];
                }
            }
        }
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==-1 && b== -1 && c==-1){
                break;
            }
            int answer = w(a,b,c);
            bw.write(String.format("w(%d, %d, %d) = %d\n",a,b,c,w(a,b,c)));
        }
        bw.close();
    }
    static int w(int a, int b ,int c){
        if(a <= 0 || b <= 0 || c<= 0) return 1;
        if(a >20 || b >20 || c > 20) return w(20,20,20);
        return w[a][b][c];
    }
}
