package zuochenyun.binaryTree;

import java.util.HashMap;

public class GetPostArray {
    public int[] getPostArray(int[] pre,int[] in){
        if(pre==null||in==null)
            return null;
        int len=pre.length;
        int[] pos=new int[len];
        HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
        for (int i = 0; i <len ; i++) {
            map.put(in[i],i);
        }
        setPos(pre,0,len-1,in,0,len-1,pos,len-1,map);
        return pos;

    }

    private int  setPos(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd, int[] pos, int posEnd, HashMap<Integer, Integer> map) {
        if(preStart>preEnd)
            return posEnd;

        pos[posEnd--]=pre[preStart];
        int index=map.get(pre[preStart]);
        posEnd=setPos(pre,preStart+index-inStart,preEnd,in,index+1,inEnd,pos,posEnd,map);
        posEnd=setPos(pre,preStart+1,preStart+index-inStart,in,inStart,index-1,pos,posEnd,map);
        return posEnd;


    }
}
