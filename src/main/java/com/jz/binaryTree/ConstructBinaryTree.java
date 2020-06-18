package com.jz.binaryTree;


import java.util.Arrays;

public class ConstructBinaryTree {

    //  Definition for binary tree
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
          int length=pre.length;
          if(length==0)
              return null;
        //数组长度仅为1的时候就要处理
        if(pre.length == 1){
            return new TreeNode(pre[0]);
        }
          //构建根节点
          TreeNode root = new TreeNode(pre[0]);


          int rootIndex=0;
        for (int i = 0; i <in.length-1 ; i++) {
            if(in[i]==pre[0]){
                rootIndex=i;
                break;
            }


        }
        //递归，假设root的左右子树都已经构建完毕，那么只要将左右子树安到root左右即可
        //这里注意Arrays.copyOfRange(int[],start,end)是[)的区间
        root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),
                Arrays.copyOfRange(in,0,rootIndex));
        root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),
                Arrays.copyOfRange(in,rootIndex+1,in.length));

        return root;


    }
}
