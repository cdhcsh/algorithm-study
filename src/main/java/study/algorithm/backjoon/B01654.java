package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B01654 {
    static int[] lanLines;
    static int N;
    static int K;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        lanLines = new int[K];
        int min = 1000000;
        int max = 1;
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            lanLines[i] = num;
            min = Math.min(min,num);
            max = Math.max(max, num);
        }
        System.out.println(binarySearch(min,max));

    }
    static int binarySearch(int left,int right){
        while(left < right) {
            int mid = (left + right) / 2;
            int count = cal(mid);
            if (count < N)
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
    static int cal(int length){
        int count = 0;
        for (int i = 0; i < K; i++) {
            count += (lanLines[i]/length);
        }
        return count;
    }
}
