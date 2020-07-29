package enterprise.zj.binaryTree;

import enterprise.zj.binaryTree.print.TreeNode;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/19 20:33
 */
public class BuidTreeByNK {

    private int idx;

    public TreeNode buildTree(int[][] arr, int rootVal){
        if(arr == null || arr.length == 0 || rootVal == 0) return null;

        TreeNode root = new TreeNode(rootVal);

        idx = 0;
        helpBuildTree(arr, root);

        return root;
    }

    private void helpBuildTree(int[][] arr, TreeNode node){
        if(idx >= arr.length) return;

        int index = idx;

        if(arr[index][1] != 0) node.left = new TreeNode(arr[index][1]);
        if(arr[index][2] != 0) node.right = new TreeNode(arr[index][2]);

        if(arr[index][1] != 0){
            idx++;
            helpBuildTree(arr, node.left);
        }

        if(arr[index][2] != 0){
            idx++;
            helpBuildTree(arr, node.right);
        }

    }




}
