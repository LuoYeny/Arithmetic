package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 15:37
 */
//最大二叉搜索子树
public class MaxSearchTree {
    public class ReturnType{
        public TreeNode maxBSTHead;
        public int maxBSTSize;
        public int min;
        public int max;

        public ReturnType(TreeNode maxBSTHead, int maxBSTSize, int min, int max) {
            this.maxBSTHead = maxBSTHead;
            this.maxBSTSize = maxBSTSize;
            this.min = min;
            this.max = max;
        }
    }



    public ReturnType prosess(TreeNode head){
        if(head==null)
            return new ReturnType(null,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        ReturnType resL=prosess(head.left);
        ReturnType resR=prosess(head.right);
        TreeNode maxBSTHead =resL.maxBSTSize>=resR.maxBSTSize?resL.maxBSTHead:resR.maxBSTHead;
        int maxBSTSize=Math.max(resL.maxBSTSize,resR.maxBSTSize);
        int min=Math.min(resL.min,Math.min(resR.min,head.val));
        int max=Math.max(resL.max,Math.max(head.val,resR.max));

        if(resL.maxBSTHead==head.left&&resR.maxBSTHead==head.right&&
               resL.max<head.val&&head.val<resR.min){
            maxBSTHead =head;
            maxBSTSize=resL.maxBSTSize+resR.maxBSTSize+1;

        }


        return new ReturnType(maxBSTHead,maxBSTSize,min,max);


    }
}
