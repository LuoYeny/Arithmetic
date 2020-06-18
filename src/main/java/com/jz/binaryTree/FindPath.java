package com.jz.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class FindPath {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
        public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {

            int currentSum=0;
            ArrayList<TreeNode> stackList = new ArrayList<TreeNode>();
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
            if (root == null)
                return arrayList;
            arrayList=  solution(root,stackList,arrayList,currentSum,target);
            return arrayList;
        }

        private ArrayList<ArrayList<Integer>> solution(TreeNode root, ArrayList<TreeNode> stackList,
                                                       ArrayList<ArrayList<Integer>> arrayList,
                                                       int currentSum, int target) {
            currentSum=currentSum+root.val;
            stackList.add(root);
            boolean isLeaf = root.left==null&&root.right==null;

            if(currentSum==target&&isLeaf){
                 ArrayList arrayPath=new ArrayList();
                for (int i = 0; i <stackList.size() ; i++) {
                    arrayPath.add(stackList.get(i).val);
                }
                arrayList.add(arrayPath);
            }

            if(root.left!=null){
                solution(root.left,stackList,arrayList,currentSum,target);
            }
            if(root.right!=null){
                solution(root.right,stackList,arrayList,currentSum,target);
            }

            stackList.remove(stackList.size()-1);

            return arrayList;

        }
    }
}
