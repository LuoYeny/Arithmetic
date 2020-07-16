package zuochenyun.practice.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/24 16:42
 */
public class PreInToPos {
    public int[] preInToPos(int[] pre,int[] in){
             if(pre==null||in==null)
                 return null;
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <in.length ; i++) {
            map.put(in[i],i);
        }
             int[] pos=new int[pre.length];
               solution(pre,0,pre.length-1,pos,pos.length-1,map,in,0,in.length-1);
               return pos;

    }

    //返回下一个要填入的位置
    private int solution(int[] pre, int pS, int pE, int[] pos, int si,
                           Map<Integer, Integer> map, int[] in, int iS, int iE) {

        if(pE<pS)
            return si;
        int mid=map.get(pre[pS]);
        pos[si--]=pre[pS];
        si=solution(pre,pS+mid-iS+1,pE,pos,si,map,in,mid+1,iE);
        si=solution(pre,pS+1,pS+mid-iS,pos,si,map,in,iS,mid-1);
        return si;



    }
}
