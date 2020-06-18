package zuochenyun.practice.tree;

import zuochenyun.practice.tree.print.ConstructTree;
import zuochenyun.practice.tree.print.TreeOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 16:43
 */
public class Test {
    public static void main(String[] args) {
        // 根据给定的数组创建一棵树
       // TreeNode root = ConstructTree.constructTree(new Integer[] {1, 2, 3, 4, 5 ,6, 7,1,2,3,4});
        TreeNode root = ConstructTree.constructTree(new Integer[] {4,2,6,1,3,5,2});
        // 将刚刚创建的树打印出来
        TreeOperation.show(root);
//        new PreOder().preOderByStack(root);
//        new InOder().inOderByStack(root);
//        new PosOrder().posOrderByStack(root);


       // System.out.println(new GetMaxLength().getMaxLength(root,8));
//        System.out.println(new MaxSearchTree().prosess(root).maxBSTSize);
//        TreeOperation.show(new MaxSearchTree().prosess(root).maxBSTHead);

     //   System.out.println(new BSTTopoSize().bstTopoSize(root));
       // new PrintByLevel().printByLevel(root);
        new PrintByZigZag().printByZigZag(root);
    }

}
