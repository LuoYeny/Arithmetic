package zuochenyun.binaryTree;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/5 22:26
 */
public class IsBST {
    public static boolean isBST(Node tree){
        if(tree == null) return true;

        Stack<Node> stack = new Stack<>();
        int preNode = Integer.MIN_VALUE;

        while(!stack.empty() || tree != null){
            if(tree != null){
                stack.push(tree);
                tree = tree.left;
            }else{
                tree = stack.pop();
                if(preNode > tree.value){
                    return false;
                }
                preNode = tree.value;
                tree = tree.right;
            }
        }
        return true;
    }
}
