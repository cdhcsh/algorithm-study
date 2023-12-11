package study.algorithm.backjoon;

/**
 * IF문 좀 대신 써줘
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B19637 {
    static int N;

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<String> strs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        list = new ArrayList<>();
        strs = new ArrayList<>();

        N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int p = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int v = Integer.parseInt(st.nextToken());
            if(p > 0 && list.get(p-1).equals(v)) continue;
            list.add(v);
            strs.add(s);
            p++;
        }
        for (int i = 0; i < T; i++) {
            int v = Integer.parseInt(br.readLine());
            bw.write(strs.get(solve(v))+"\n");
        }
        bw.close();
    }
    public static int solve(int value){
        int left = 0;
        int right = list.size();
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            int d = list.get(mid);
            if(d == value) return mid;
            if(d >= value) right = mid;
            else left = mid+1;
        }
        return left;
    }
}
