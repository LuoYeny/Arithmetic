package zuochenyun.practice.tree;

import zuochenyun.practice.tree.print.ConstructTree;
import zuochenyun.practice.tree.print.TreeOperation;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 16:43
 */
public class Test {
    public static void main(String[] args) {
        // 根据给定的数组创建一棵树
       // TreeNode root = ConstructTree.constructTree(new Integer[] {1, 2, 3, 4, 5 ,6, 7,1,2,3,4});
      //  TreeNode root = ConstructTree.constructTree(new Integer[] {4,2,6,1,3,5,2});
        // 将刚刚创建的树打印出来
   //     TreeOperation.show(root);
//        new PreOder().preOderByStack(root);
//        new InOder().inOderByStack(root);
//        new PosOrder().posOrderByStack(root);


       // System.out.println(new GetMaxLength().getMaxLength(root,8));
//        System.out.println(new MaxSearchTree().prosess(root).maxBSTSize);
//        TreeOperation.show(new MaxSearchTree().prosess(root).maxBSTHead);

     //   System.out.println(new BSTTopoSize().bstTopoSize(root));
       // new PrintByLevel().printByLevel(root);
    //    new PrintByZigZag().printByZigZag(root);

//        String s=new SerializeTree().serialize(root);
//        System.out.println(s);
//      TreeNode node=  new SerializeTree().deserialize(s);
//        TreeOperation.show(node);

      //  TreeNode node = ConstructTree.constructTree(new Integer[] {2,1,3});
      //  TreeOperation.show(node);
      //  int[] array={1,3,2};

     //   System.out.println(new IsPosArray().isPosArray(array));
//        TreeOperation.show(new PosArrayToBST().posArrayToBST(array));
        //System.out.println( new IsSubtree().isSubtree(root,node));
//
//        int[] array={1,2,3,5,7,9,12};
//        TreeOperation.show(new GenerateTree().generateTree(array));
//        System.out.println("MaxDistence  "+new MaxDistence().maxDistence(new GenerateTree().generateTree(array)));
//        System.out.println("isBST  "+new IsBST().isBST(new GenerateTree().generateTree(array)));
//        System.out.println("isCBT  "+new IsCBT().isCBT(new GenerateTree().generateTree(array)));
//        int[] pre={1,2,4,5,8,9,3,6,7};
//        int[] in={4,2,8,5,9,1,6,3,7};
//        int[] pos={4,8,9,5,2,6,7,3,1};
//
//        TreeOperation.show(new PreInToTree().preInToTree(pre,in));
//        TreeOperation.show(new PosInToTree().posInToTree(pos,in));
//
//        int[] pos1 =new PreInToPos().preInToPos(pre,in);
//        for (int i = 0; i <pos1.length ; i++) {
//            System.out.print(pos1[i]+"  ");
//        }

        int[] array={1,2,3,5,7,9,12};
        TreeOperation.show(new GenerateTree().generateTree(array));
        System.out.println(new CBTNodeNum().CBTNodeNum(new GenerateTree().generateTree(array)));

        System.out.println(getNum(new GenerateTree().generateTree(array)));
        System.out.println(Integer.MAX_VALUE);

    }

    public static int getNum(TreeNode root ){
        if(root==null)
            return 0;
        int l=getNum(root.left );
        int r=getNum(root.right );
        return l+r+1;
    }

}
