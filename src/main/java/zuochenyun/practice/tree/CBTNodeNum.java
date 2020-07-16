package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/24 17:40
 */
//完全二叉树的节点数
public class CBTNodeNum {
    //判断二叉树的右子树的最左节点的层数是否为当前二叉树的高度
    //是 左子树为满二叉树 h-1
    //否 右子树为满二叉树 h-2
    public int CBTNodeNum(TreeNode head){
        if(head==null)
            return 0;
        int h=mostLeftLevel(head,1);
        int res= bs(head,1,h);

        return res;
    }

    private int bs(TreeNode head, int level, int h) {
        if(level==h)
            return 1;
        if(mostLeftLevel(head.right,level+1)==h){
            return (1<<(h-level))+bs(head.right,level+1,h);
        }else {
            return (1<<(h-level-1))+bs(head.left,level+1,h);
        }



    }

    private int mostLeftLevel(TreeNode head,int level) {

        while (head!=null){
            level++;
            head=head.left;
        }

        return level-1;
    }
}
