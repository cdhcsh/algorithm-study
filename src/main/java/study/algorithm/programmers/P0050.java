package study.algorithm.programmers;

import java.util.HashSet;
import java.util.Set;

public class P0050 {
    public static void start(){
        int[] elements = {7,9,1,1,4};
        P0050 obj = new P0050();
        System.out.println(obj.solution(elements));

    }
    Set<Integer> set = new HashSet<>();
    boolean[] visit;
    public int solution(int[] elements) {
        int length = elements.length;
        int total = getSum(0,length-1,elements);
        set.add(total);
        for(int i = 0 ; i <= length/2 ; i++){
            for(int j = 0 ; j < length; j++){
                int num = getSum(j,j+i,elements);
                set.add(num);
                set.add(total-num);
            }
        }
        return set.size();
    }
    public int getSum(int n1,int n2,int[] elements){
        int sum = 0;
        int min;
        int max = Math.max(n1,n2);
        if(max >= elements.length){
            min = max%elements.length+1;
            max = Math.min(n1,n2) -1;
        }
        else min = Math.min(n1,n2);
        for(int i = min; i <= max ; i++)
            sum+= elements[i];
        return sum;
    }
}
