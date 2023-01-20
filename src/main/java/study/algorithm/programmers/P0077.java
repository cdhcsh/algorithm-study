package study.algorithm.programmers;

import java.util.Arrays;

public class P0077 {
    public long solution(int cap,int n,int[] deliveries,int[] pickups){
        long answer = 0l;
        int give = 0;
        int get = 0;
        for(int i=n-1 ;i>=0;--i)
        {
            if(deliveries[i]!=0 || pickups[i]!=0)
            {
                int cnt=0;
                while(give < deliveries[i] || get< pickups[i])
                {
                    ++cnt;
                    give+=cap;
                    get+=cap;
                }
                give -= deliveries[i];
                get -=  pickups[i];
                answer += (long)((i+1)*cnt*2);
            }
        }
        return answer;
    }
}
