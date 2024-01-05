package study.algorithm.etc;

import java.io.*;
import java.util.StringTokenizer;

public class SWExpertAcademy01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if(s==d){
                bw.write("#"+t+" 1\n");
                continue;
            }
            int sa[] = getXY(Math.min(s,d));
            int da[] = getXY(Math.max(s,d));

            int r = da[0]-sa[0];
            if(da[1] > sa[1]) r += da[1] - sa[1];
            else if(da[1] < sa[1]-r) r+= (sa[1]-r) - da[1];
            bw.write("#"+t+ " " + r +"\n");
        }
        bw.close();
    }

    public static int[] getXY(int n){
        int c = 0;
        do{
            n-=++c;
        }while (n > 0);
        return new int[]{c,n};

    }
}
