package enterprise.zj.binaryTree;


import enterprise.zj.binaryTree.print.ConstructTree;
import enterprise.zj.binaryTree.print.TreeNode;
import enterprise.zj.binaryTree.print.TreeOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/20 16:10
 */
//公共祖先节点
public class PublicGrand {

    public static void main(String[] args) {

         TreeNode root = ConstructTree.constructTree(new Integer[] {1, 2, 3});


             TreeOperation.show(root);
        System.out.println(new PublicGrand().solution(root,2,3).val);
    }
    public TreeNode solution(TreeNode root,int a,int b){
        TreeNode o1 = new TreeNode(a);
        TreeNode o2 = new TreeNode(b);

        TreeNode res=  getGrand(root,o1,o2);

        return res;


    }
    public TreeNode getGrand( TreeNode node, TreeNode o1, TreeNode o2){
        if(node==null||node.val==o1.val||node.val==o2.val)
            return node;

        TreeNode left = getGrand(node.left,o1,o2);
        TreeNode right = getGrand(node.right,o1,o2);
        if(left!=null&&right!=null)
            return node;

        return left!=null?left:right;

    }
}

