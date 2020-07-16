package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/19 16:12
 */
public class IsSubtree {

    public boolean isSubtree(TreeNode t1,TreeNode t2){
        if(t2==null)
            return true;
        String s1=serialize(t1);
        String s2=serialize(t2);



        return s1.contains(s2);

    }


    public String serialize(TreeNode head) {

        while (head==null)
            return "#!";
        String res=head.val+"!";
        res+=serialize(head.left);
        res+=serialize(head.right);
        return res;


    }
}
