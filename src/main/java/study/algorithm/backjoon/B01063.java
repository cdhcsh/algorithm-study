package study.algorithm.backjoon;

/**
 * 킹
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] king = new int[2];
        int[] stone = new int[2];
        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        king[0] = s.charAt(0) - 'A';
        king[1] = s.charAt(1) - '1';
        s = st.nextToken();
        stone[0] = s.charAt(0) - 'A';
        stone[1] = s.charAt(1) - '1';

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            int[] kingTemp = king.clone();
            String d = br.readLine();
            move(kingTemp,d);
            if(!check(kingTemp)) continue;
            if(kingTemp[0]==stone[0] && kingTemp[1] == stone[1]){
                int[] stoneTemp = stone.clone();
                move(stoneTemp,d);
                if(!check(stoneTemp)) continue;
                stone = stoneTemp;
            }
            king = kingTemp;
        }
        bw.write((char)(king[0]+'A'));
        bw.write((king[1]+1)+"\n");
        bw.write((char)(stone[0]+'A'));
        bw.write((stone[1]+1)+"");
        bw.close();


    }
    static boolean check(int[] p){
        return p[0] >= 0 && p[0] < 8 && p[1] >= 0 && p[1] < 8;
    }
    static void move(int[] p,String t){
        switch (t){
            case "R" : p[0]++;break;
            case "L" : p[0]--;break;
            case "B" : p[1]--;break;
            case "T" : p[1]++;break;
            case "RT" : p[0]++;p[1]++;break;
            case "LT" : p[0]--;p[1]++;break;
            case "RB" : p[0]++;p[1]--;break;
            case "LB" : p[0]--;p[1]--;break;
        }
    }
}
