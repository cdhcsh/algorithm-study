package study.algorithm.backjoon;

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class B01629 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(pow(a,b,c));
    }
    static long pow(int a,int b, int c){
        if(b == 0)
            return 1;
        long n = pow(a,b/2,c);
        long m = n * n % c;
        if(b%2==0)
            return m;
        else
            return m * a % c;
    }
}
