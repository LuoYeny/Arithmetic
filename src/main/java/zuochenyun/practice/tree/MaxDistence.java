package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 16:48
 */
public class MaxDistence {
    public class ReturnType{
        public int maxDistence;
        public int height;

        public ReturnType(int maxDistence, int height) {
            this.maxDistence = maxDistence;
            this.height = height;
        }
    }

    public int maxDistence(TreeNode head){
        if(head==null)
            return 0;

        ReturnType returnType = solution(head );
        return returnType.maxDistence;
    }

    private ReturnType solution(TreeNode head ) {
        if(head==null)
            return new ReturnType(0,0);

        ReturnType lT=solution(head.left );
        ReturnType rT=solution(head.right );
        int height=Math.max(lT.height ,rT.height)+1;
        int maxDistence=Math.max(lT.height+rT.height+1,Math.max(lT.maxDistence,rT.maxDistence));

        return new ReturnType(maxDistence,height);
    }

}
