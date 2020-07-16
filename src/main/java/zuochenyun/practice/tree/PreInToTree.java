package zuochenyun.practice.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 17:14
 */
//前序遍历和后序遍历构造二叉树
public class PreInToTree {
    public TreeNode preInToTree(int[] pre,int[] in){
        if(pre==null||in==null)
            return null;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <in.length ; i++) {
            map.put(in[i],i);
        }
        TreeNode node = solution(pre,0,pre.length-1,map,in,0,in.length-1);
        return node;



    }

    private TreeNode solution(int[] pre, int pS, int pE, Map<Integer, Integer> map, int[] in, int iS, int iE) {
        if(pE<pS||iE<iS)
            return null;
        TreeNode head= new TreeNode(pre[pS]);
        int mid=map.get(pre[pS]);
        head.left=solution(pre,pS+1,pS+mid-iS,map,in,iS,mid-1);
        head.right=solution(pre,pS+mid-iS+1,pE,map,in,mid+1,iE);
        return head;
    }
}
