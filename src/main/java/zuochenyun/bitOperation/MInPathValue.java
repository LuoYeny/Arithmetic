package zuochenyun.bitOperation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/5 15:33
 */
public class MInPathValue {
    public static int minPathValue(int[][] m){
        if(m==null||m.length==0||m[0].length==0||m[0][0]==0||m[m.length-1][m[0].length-1]==0)
            return 0;
        int rel=0;
        int[][] map= new int[m.length][m[0].length];
        Queue<Integer> rq=new LinkedList<>();
        Queue<Integer> cq=new LinkedList<>();
        int r=0;
        int c=0;
        map[0][0]=1;
        rq.add(r);
        cq.add(c);
        while (!rq.isEmpty()){
            r=rq.poll();
            c=cq.poll();
            if(r==m.length-1&&c==m[0].length-1)
                return map[r][c];

            workTo(map[r][c],r+1,c,m,map,rq,cq);
            workTo(map[r][c],r-1,c,m,map,rq,cq);
            workTo(map[r][c],r,c+1,m,map,rq,cq);
            workTo(map[r][c],r,c-1,m,map,rq,cq);

        }
        return rel;


    }

    private static void workTo(int pre, int toR, int toC, int[][] m, int[][] map, Queue<Integer> rq, Queue<Integer> cq) {
        if(toR<0||toR==m.length||toC<0||toC==m[0].length||m[toR][toC]!=1||map[toR][toC]!=0){
            return;
        }
        map[toR][toC]=pre+1;
        rq.add(toR);
        cq.add(toC);

    }

    public static void main(String[] args) {
        int[][] a={{1,0,0,0},{1,1,1,1},{0,0,0,1},{1,1,1,1}};
        System.out.println(minPathValue(a));
    }
}
