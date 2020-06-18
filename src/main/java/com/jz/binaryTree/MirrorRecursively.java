package com.jz.binaryTree;

public class MirrorRecursively {
    //  Definition for binary tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void Mirror(TreeNode root) {

        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            return;
        TreeNode temp = root.right;
        root.right=root.left;
        root.left=temp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);

    }
}
