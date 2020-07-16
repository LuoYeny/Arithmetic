package zuochenyun.practice.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/24 15:52
 */
//后序遍历和中序遍历构造二叉树
public class PosInToTree {
    public TreeNode posInToTree(int[] pos,int[] in){
        if(pos==null||in==null)
            return null;
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <in.length ; i++) {
            map.put(in[i],i);
        }
        TreeNode node= solution(pos,0,pos.length-1,map,in,0,in.length-1);
        return node;
    }

    private TreeNode solution(int[] pos, int pS, int pE, Map<Integer, Integer> map, int[] in, int iS, int iE) {
        if(iS>iE)
            return null;
        TreeNode head= new TreeNode(pos[pE]);
        int mid=map.get(pos[pE]);

        head.left=solution(pos,pS,pS+(mid-iS)-1,map,in,iS,mid-1);
        head.right=solution(pos,pS+(mid-iS),pE-1,map,in,mid+1,iE);


        return head;
    }
}
