package study.algorithm.backjoon;

/**
 * 수찾기
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01920 {
    static int n ;
    static int[] arr;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(Integer.parseInt(st.nextToken())));
        }
    }
    static int binarySearch(int num){
        int start = 0;
        int end = n-1;
        int mid;
        while(start <= end) {
            mid = (start+end)/2;
            if(arr[mid] > num){
                end = mid - 1;
            }
            else if(arr[mid] < num){
                start = mid + 1;
            }
            else{
                return 1;
            }
        }
        return 0;

    }
}
