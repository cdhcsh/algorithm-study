package study.algorithm.programmers;

/**
 * n진수게임
 */
public class P0080 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; sb.length() < t*m+(p-1) ; i++){
            sb.append(Integer.toString(i,n).toUpperCase());
        }
        String s = sb.toString();
        sb = new StringBuilder();
        for(int i = 0 ; i < t ; i++){
            sb.append(s.charAt((p + (i*m) - 1)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P0080().solution(16,16,2,2));
    }
}
