package study.algorithm.backjoon;

import java.io.*;

/**
 * 대푯값2
 */

public class B02587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        arr[0] = Integer.parseInt(br.readLine());
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int key = Integer.parseInt(br.readLine());
            int j = i - 1;
            for (; j >= 0; j--)
                if (arr[j] > key)
                    arr[j + 1] = arr[j];
                else
                    break;
            arr[j + 1] = key;
            sum += key;
        }
        bw.write(sum/5+"\n");
        bw.write(arr[5/2]+"");
        bw.close();
    }
}
