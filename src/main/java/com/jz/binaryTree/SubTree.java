package com.jz.binaryTree;

public class SubTree {
    //  Definition for binary tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasSbutree(TreeNode root1,TreeNode root2){

        boolean flag = false;
        if(root1!=null&&root2!=null){

            if(root1.val==root2.val){

                flag=daseTree1HasTree2(root1,root2);
            }
            if(flag==false){
                flag=hasSbutree(root1.left,root2);
            }

            if(flag==false){
                flag=hasSbutree(root1.right,root2);
            }


        }

        return flag;
    }

    private boolean daseTree1HasTree2(TreeNode root1, TreeNode root2) {
        if(root2==null)
            return  true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;

       return daseTree1HasTree2(root1.left,root2.left)
               &&daseTree1HasTree2(root1.right,root2.right);

    }
}
