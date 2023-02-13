package study.algorithm.backjoon;

/**
 * 나이순 정렬
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        Member[] arr = new Member[length];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new Member(i, age, name);
        }
        Arrays.sort(arr);
        for (Member member : arr) {
            bw.write(member.toString()+"\n");
        }
        bw.close();


    }

    static class Member implements Comparable{
        int no;
        int age;
        String name;

        public Member(int no, int age, String name) {
            this.no = no;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            if(o.getClass().equals(this.getClass())){
                Member m = (Member) o;
                if (this.age == m.age)
                    return this.no - m.no;
                else return this.age-m.age;
            }
            else return 0;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
