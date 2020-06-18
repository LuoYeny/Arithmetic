package zuochenyun.binaryTree;

import java.util.HashMap;

public class PreInToTree {
    public Node preInToTree(int [] pre,int[] in){
        if(pre==null||in==null)
            return null;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i <in.length ; i++) {
            map.put(in[i],i);
        }
        Node head = preIn(pre,0,pre.length-1,in,0,in.length-1,map);
        return head;
    }

    private Node preIn(int[] pre, int p1, int p2, int[] in, int i1, int i2, HashMap<Integer, Integer> map) {
        if(p1>p2)
            return null;
        Node node = new Node(pre[p1]);
        int index=map.get(pre[p1]);
        node.left=preIn(pre,p1+1,p1+index-i1,in,0,index-1,map);
        node.right=preIn(pre,p1+index-i1+1,p2,in,index+1,i2,map);
        return node;
    }
}
