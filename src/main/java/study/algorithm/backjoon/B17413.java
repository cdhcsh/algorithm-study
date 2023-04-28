package study.algorithm.backjoon;

/**
 * 단어 뒤집기 2
 */

import java.io.*;
import java.util.StringTokenizer;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," <>",true);

        boolean b = false;
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            System.out.println(str);
            if(str.equals("<")) b = true;
            else if(str.equals(">")) b = false;
            else if(!b) str = reverse(str);
            bw.write(str);
        }
        bw.close();


    }
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
