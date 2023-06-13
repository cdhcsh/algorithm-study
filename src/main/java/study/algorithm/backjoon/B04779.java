package study.algorithm.backjoon;

/**
 * 칸토어 집합
 */

import java.io.*;

public class B04779 {
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            int len = (int) Math.pow(3, n);
            //길이가 3^n 이고 '-'로 이루어진 문자열 미리 만들어 놓고, 재귀함수 시작하기
            sb.append("-".repeat(Math.max(0, len)));
            solve(n, 1);
            System.out.println(sb);
        }

    }

    public static void solve(int n,int size) { //시작 인덱스, 문자열 사이즈
        if(size==1) { //문자열 사이즈가 1이되면 리턴
            return;
        }
        int m=size/3;
        // 3등분한 문자열의 2번째 부분 공백처리
        for(int i=n+m; i<n+2*m; i++) {
            sb.setCharAt(i, ' ');
        }

        solve(n, m); // 3등분한 문자열에서 첫번째 부분
        solve(n+2*m, m); // 3등분한 문자열의 세번째 부분
    }

}
