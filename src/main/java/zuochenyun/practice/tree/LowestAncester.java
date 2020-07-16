package zuochenyun.practice.tree;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 16:18
 */
//最近的公共祖先节点
public class LowestAncester {
    public TreeNode lowestAncester(TreeNode head,TreeNode o1,TreeNode o2){
        if(head==null||head==o1||head==o2)
            return head;

      TreeNode left= lowestAncester(head.left,o1,o2);
      TreeNode right=lowestAncester(head.right,o1,o2);
      if(left!=null||right!=null)
          return head;

      return left!=null?left:right;

    }
}
