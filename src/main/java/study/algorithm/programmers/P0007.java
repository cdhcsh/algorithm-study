package study.algorithm.programmers;

import java.util.Stack;

public class P0007 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        String str = "";
        for (int i : ingredient) {
            str += i;
        }
        for(int i = 3 ; i < str.length() ;){
            int begin = i-3;
            if(Integer.parseInt(str.substring(begin,i+1))==1231){
                str = (begin > 0 ? str.substring(0,begin) : "") +
                        (i < str.length()-1 ? str.substring(i+1) : "");
                answer++;
                i = begin < 3 ? 3 : begin;
            }
            else i++;
        }
        return answer;
    }
    public static int solution2(int[] ingredient){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String temp = "";
        for (int i = 0 ; i < ingredient.length ; i++) {
            stack.push(ingredient[i]);
            if(stack.size() >= 4){
                for(int j = 4 ; j  > 0 ; j--){
                    temp += stack.get(stack.size()-j);
                }
                System.out.println(temp);
                if(temp.equals("1231")){
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
                temp = "";
            }
        }
        return answer;
    }
}
