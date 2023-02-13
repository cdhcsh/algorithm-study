package study.algorithm.backjoon;

import java.io.*;
import java.util.Arrays;

/**
 * 단어 정렬
 */

public class B01181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        String[] arr = new String[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr,(s1,s2)->{
            if(s1.length()==s2.length())
                return s1.compareTo(s2);
            else return s1.length()-s2.length();
        });
        String temp = "";
        for (String s : arr) {
            if(temp.equals(s))continue;
            else temp = s;
            bw.write(s+"\n");
        }
        bw.close();

    }
}
