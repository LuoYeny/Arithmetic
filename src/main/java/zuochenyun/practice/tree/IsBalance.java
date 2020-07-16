package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/22 15:46
 */
//判断二叉树是否为平衡二叉树
public class IsBalance {

    public class ReturnType{
       public boolean isBalance;
        public int height;

        public ReturnType(boolean isBalance, int height) {
            this.isBalance = isBalance;
            this.height = height;
        }
    }


    public boolean isBalance(TreeNode head){
        if(head==null)
            return true;

        ReturnType returnType= solution(head,1);
        return returnType.isBalance;

    }

    private ReturnType solution(TreeNode head, int level) {
        if(head==null)
            return new ReturnType(true,level);
        ReturnType lRe=solution(head.left,level+1);
        ReturnType rRe=solution(head.right,level+1);
        boolean isBlance =lRe.isBalance&&rRe.isBalance&&Math.abs(lRe.height-rRe.height)<2;
        int height=Math.max(lRe.height,rRe.height)+1;

        return new ReturnType(isBlance,height);
    }
}
