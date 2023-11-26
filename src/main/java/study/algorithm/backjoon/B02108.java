package study.algorithm.backjoon;

/**
 * 통계학
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class B02108 {
    static int N;
    static int[] arr;
    static HashMap<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);

        System.out.println(getAverage());
        System.out.println(getCenter());
        System.out.println(getMode());
        System.out.println(getRange());
    }
    public static int getAverage(){
        return Math.round(IntStream.range(0,N).map(i -> arr[i]).sum()/(N+0.0f));
    }
    public static int getCenter(){
        return arr[N/2];
    }
    public static int getMode(){
        int[] keys = map.keySet().stream().sorted((k1,k2)->{
            int v1 = map.get(k1);
            int v2 = map.get(k2);
            if(v1 == v2) return k1 - k2;
            return v2 - v1;
        }).mapToInt(i->i).toArray();
        int min = keys[0];
        if(keys.length > 1 && (map.get(min) == map.get(keys[1]))) min = keys[1];
        return min;
    }
    public static int getRange(){
        return Math.abs(arr[arr.length-1]-arr[0]);
    }
}