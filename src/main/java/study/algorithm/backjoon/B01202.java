package study.algorithm.backjoon;

/**
 * 보석도둑
 */

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B01202 {
    static int N;
    static int K;
    static int[] bag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bag = new int[K];
        PriorityQueue<Integer[]> gemQueue = new PriorityQueue<>((i1, i2) -> {
            if (i1[0].equals(i2[0])) return i2[1]-i1[1];
            else return i1[0]-i2[0];
        });
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Integer[] gem = new Integer[2];
            gem[0] = Integer.valueOf(st.nextToken());
            gem[1] = Integer.valueOf(st.nextToken());
            gemQueue.offer(gem);
        }
        for (int i = 0; i < K; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bag);

        PriorityQueue<Integer> temp = new PriorityQueue<>((i1, i2) -> i2-i1);

        long answer = 0;
        for (int i = 0; i < K; i++) {
            while(!gemQueue.isEmpty() && gemQueue.peek()[0] <= bag[i]){
                temp.offer(gemQueue.poll()[1]);
            }
            if(!temp.isEmpty())answer+=temp.poll();
        }
        System.out.println(answer);
    }
}
