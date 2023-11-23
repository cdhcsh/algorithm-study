package study.algorithm.backjoon;

/**
 * 삼각형과 세 변
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B05073 {
    static String[] answers = {"Invalid","Equilateral","Isosceles","Scalene"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[3];
        while(true){
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if(arr[2]==0) break;
            int answer = 3;
            if(arr[2] >= arr[0] + arr[1]) answer = 0;
            else if(arr[0] == arr[1] && arr[1] == arr[2])answer = 1;
            else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2])answer=2;
            bw.write(answers[answer]+"\n");
        }
        bw.close();
    }
}
