package study.algorithm.backjoon;

/**
 * 좌표 압축
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        int[] clone;
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        clone = arr.clone();
        arr = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0 ; i < arr.length ; i++ ) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < clone.length; i++) {
            bw.write(map.get(clone[i])+" ");
        }
        bw.close();


    }
}
