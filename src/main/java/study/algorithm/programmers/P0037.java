package study.algorithm.programmers;
import java.util.LinkedList;
import java.util.Queue;
public class P0037{
    public int solution(int[][] maps) {
        int xm = maps.length;
        int ym = maps[0].length;
        int[][] visit = new int[xm][ym];
        visit[xm-1][ym-1] = -1;
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0,1));
        visit[0][0] = 1;
        while(!queue.isEmpty()){
            Point p = queue.remove();
            for(int i = 0 ; i < 4 ; i++){
                Point m = p.move(d[i]);
                if(m.check(xm,ym) && visit[m.x][m.y] <= 0 && maps[m.x][m.y] == 1){
                    visit[m.x][m.y] = m.cnt;
                    queue.add(m);
                }
            }
        }
        return visit[xm-1][ym-1];
    }
    class Point{
        int x;
        int y;
        int cnt;
        public Point(int x, int y,int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
        public Point move(int[] arr){
            return new Point(x+arr[0],y+arr[1],cnt+1);
        }
        public boolean check(int xm,int ym){
            if(x < 0 || x >= xm) return false;
            else return y >= 0 && y < ym;
        }
    }
}
