package study.algorithm.backjoon;

/**
 * 터렛
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        Turret a;
        Turret b;
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            a = new Turret(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            b = new Turret(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            double distance = a.getDistance(b);
            int answer;
            if(distance == 0){
                if(a.r == b.r) answer = -1;
                else answer = 0;
            }
            else{
                if(distance == Math.pow(a.r+b.r,2)) answer = 1;
                else if(distance > Math.pow(a.r+b.r,2)) answer = 0;
                else if(distance == Math.pow(a.r-b.r,2)) answer = 1;
                else if(distance < Math.pow(a.r-b.r,2)) answer = 0;
                else answer = 2;
            }
            bw.write(answer+"\n");
        }
        bw.close();
    }
    static class Turret{
        int x;
        int y;
        int r;

        public Turret(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
        double getDistance(Turret t){
            return Math.pow(this.x-t.x,2)+Math.pow(this.y-t.y,2);
        }
    }
}
