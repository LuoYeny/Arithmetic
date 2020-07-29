package enterprise.zj.binaryTree;

import enterprise.zj.binaryTree.print.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/20 15:13
 */
public class PrintByLevel {
    public void printByZigZag(TreeNode root) {
        if (root == null)
            return;
        Deque<TreeNode> deque = new LinkedList<>();
        boolean flag = true;
        TreeNode nlast = null;
        TreeNode last = root;
        deque.addFirst(root);
        TreeNode node = null;
        int level = 0;
        print(flag, ++level);
        while (!deque.isEmpty()) {

            if (flag) {
                node = deque.pollFirst();


                if (node.left != null) {
                    deque.addLast(node.left);
                    nlast = nlast == null ? node.left : nlast;
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                    nlast = nlast == null ? node.right : nlast;
                }

            } else {
                node = deque.pollLast();

                if (node.right != null) {
                    deque.addFirst(node.right);
                    nlast = nlast == null ? node.right : nlast;
                }
                if (node.left != null) {
                    deque.addFirst(node.left);
                    nlast = nlast == null ? node.left : nlast;
                }


            }
            System.out.print(node.val + " ");

            if (node == last && !deque.isEmpty()) {
                flag = !flag;
                System.out.println();
                print(flag, ++level);
                last = nlast;
                nlast = null;
            }
        }

    }

    public void print(boolean flag, int level) {
        System.out.print("Level " + level + " ");
        System.out.print(flag ? "from left to right: " : "from right to left: ");

    }

    public void printByLevel(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode last = null;
        TreeNode nlast = root;
        int level = 0;
        System.out.print("Level " + (++level) + " : ");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
                last = node.left;
            }
            if (node.right != null) {
                queue.add(node.right);
                last = node.right;
            }

            if (node == nlast && !queue.isEmpty()) {
                nlast = last;
                System.out.println();
                System.out.print("Level " + (++level) + " : ");
            }
        }

    }
}
