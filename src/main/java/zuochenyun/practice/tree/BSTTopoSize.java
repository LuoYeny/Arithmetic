package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/18 14:59
 */
//符合二叉搜索的最大TOPO结构
public class BSTTopoSize {
    public int bstTopoSize(TreeNode head){
        if(head==null){
            return 0;
        }

        int max=maxTopo(head,head);
        max=Math.max(bstTopoSize(head.left),max);
        max=Math.max(bstTopoSize(head.right),max);
        return max;

    }

    private int maxTopo(TreeNode head1, TreeNode head2) {

        if(head1!=null&&head2!=null&&isBSTNode(head1,head2,head2.val)){
            return 1+maxTopo(head1,head2.left)+maxTopo(head1,head2.right);

        }
        return 0;

    }

    private boolean isBSTNode(TreeNode head1, TreeNode head2,int val) {
        if(head1==null)
            return false;

        if(head1==head2)
            return true;


       return isBSTNode(head1.val> val?head1.left:head1.right,head2,val) ;
    }

}
