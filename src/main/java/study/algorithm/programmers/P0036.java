package study.algorithm.programmers;

public class P0036 {
    String[] data;
    char[] chars;
    boolean[] visit = new boolean[8];
    int answer = 0;
    public int solution(int n,String[] data){
        chars = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        visit = new boolean[chars.length];
        this.data = data;
        dfs(new String(""),0);
        return answer;
    }
    public void dfs(String str,int l){
        if(l == chars.length){
            if(validate(str)) {
                answer++;
            }
            return;
        }
        for(int i = 0 ; i < chars.length ; i++){
            if(visit[i]) continue;
            visit[i] = true;
            dfs(str+chars[i],l+1);
            visit[i] = false;
        }
    }
    public boolean validate(String str){
        for (String s : data) {
            char from = s.charAt(0);
            char to = s.charAt(2);
            char oper = s.charAt(3);
            int count = s.charAt(4)-'0';
            int diff = Math.abs(str.indexOf(from)-str.indexOf(to))-1;
            if(oper == '=' && count != diff) return false;
            else if(oper == '>' && count >= diff) return false;
            else if (oper == '<' && count <= diff) return false;
        }
        return true;
    }
}
