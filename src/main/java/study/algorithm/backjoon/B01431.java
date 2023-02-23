package study.algorithm.backjoon;

/**
 * 시리얼 번호
 */

import java.io.*;
import java.util.Arrays;

public class B01431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        SerialNo[] arr = new SerialNo[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new SerialNo(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.close();
    }
    static class SerialNo implements Comparable<SerialNo>{
        String serialNo;

        public SerialNo(String serialNo) {
            this.serialNo = serialNo;
        }
        public int getNumberSum(){
            int sum = 0;
            for (int i = 0; i < serialNo.length(); i++) {
                if(serialNo.charAt(i) <= '9'){
                    sum+=serialNo.charAt(i)-'0';
                }
            }
            return sum;
        }
        @Override
        public int compareTo(SerialNo o) {
            int result;
            if((result = this.serialNo.length()-o.serialNo.length())!=0) return result;
            if((result = this.getNumberSum()-o.getNumberSum())!=0) return result;
            return this.serialNo.compareTo(o.serialNo);
        }

        @Override
        public String toString() {
            return serialNo;
        }
    }
}
