package study.algorithm.backjoon;

/**
 * 숫자 카드
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] target = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(target);

        length = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            bw.write(binarySearch(target,Integer.parseInt(st.nextToken()))+" ");
        }
        bw.close();
    }
    static int binarySearch(int[] target, int n) {
        int result = 0;
        int left = 0;
        int right = target.length-1;
        int mid;
        while(left <= right){
            mid = (right+left)/2;
            if(target[mid] == n){
                result = 1;
                break;
            }
            else if(target[mid] < n){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return result;
    }
}
