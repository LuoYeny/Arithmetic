package com.jz.binaryTree;

public class Convert {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode pLastNode= null;

        pLastNode= convertNode(pRootOfTree,pLastNode );

        while (pLastNode!=null&pLastNode.left!=null)
            pLastNode=pLastNode.left;
        return pLastNode;


    }

    private TreeNode convertNode(TreeNode pRootOfTree, TreeNode pLastNode) {
        if(pRootOfTree==null)
            return null ;
        TreeNode curNode =pRootOfTree;
        if(curNode.left!=null)
            pLastNode=   convertNode(curNode.left,pLastNode);
        //do something
        curNode.left=pLastNode;
        if(pLastNode!=null)
            pLastNode.right=curNode;
        pLastNode=curNode;

        if(curNode.right!=null)
            pLastNode=   convertNode(curNode.right,pLastNode);

return pLastNode;

    }
}
