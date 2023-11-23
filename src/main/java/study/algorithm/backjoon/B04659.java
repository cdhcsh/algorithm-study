package study.algorithm.backjoon;

/**
 * 비밀번호 발음하기
 */

import java.io.*;

public class B04659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String password = br.readLine();
        while (!password.equals("end")) {
            bw.write("<"+password+"> is ");
            if(!check(password))bw.write("not ");
            bw.write("acceptable.\n");
            password = br.readLine();
        }
        bw.close();
    }
    public static boolean check(String str){
        boolean hasVowel = false;
        boolean v = true;
        int cnt = 0;
        char t = ' ';
        char[] chars = str.toCharArray();
        for (char c : chars) {
            boolean b = isVowel(c);
            if(b) hasVowel = true;
            if(v ^ b){
                v = b;
                cnt = 1;
            }
            else cnt++;
            if(cnt >= 3) return false;
            if(c != t){
                t = c;
            }
            else if(c != 'e' && c != 'o') return false;
        }
        return hasVowel;
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c== 'i' || c=='o'|| c =='u';
    }
}
