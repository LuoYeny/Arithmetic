package com.jz.ch4.t23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class PrintFromTopToBottom {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        public ArrayList<Integer> printFromTopToBottom(TreeNode root) {


            Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
            ArrayList<Integer> arrayTreeNode = new ArrayList<Integer>();
            treeNodeQueue.add(root);
            if(root==null)return arrayTreeNode;


            while (treeNodeQueue.size()!=0){

                TreeNode temp = treeNodeQueue.remove();
                if(temp.left!=null)
                treeNodeQueue.add(temp.left);
                if(temp.right!=null)
                    treeNodeQueue.add(temp.right);

                arrayTreeNode.add(temp.val);


            }
            return arrayTreeNode;
        }







    }
}
