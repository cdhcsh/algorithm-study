package study.algorithm.programmers;

/**
 * 택배상자
 */

public class P0051 {
    public static void start(){
        int[] order = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        P0051 obj = new P0051();
        System.out.println(obj.solution(order));

    }
    public int solution(int[] order) {
        int[] stack = new int[order.length];
        int top = 0;
        int no = 1;
        int i;
        for (i = 0; i < order.length; ) {
            if (order[i] == no) i++;
            else if (top > 0 && stack[top - 1] == order[i]) {
                top--;
                i++;
                no--; //보조컨테이너 가져왔으므로 가져온 상자는 그대로
            } else if (no < order[i]) {
                stack[top++] = no;
            } else break;
            no++;
        }
        return i;
    }
}
