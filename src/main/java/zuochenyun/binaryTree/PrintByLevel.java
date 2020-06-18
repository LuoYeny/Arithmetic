package zuochenyun.binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintByLevel {
    public static Node createBinTree(int[] array) {
        List<Node> nodeList= new LinkedList<Node>();
        // 将一个数组的值依次转换为Node节点
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
            nodeList.add(new Node(array[nodeIndex]));
        }
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
            // 左孩子
            nodeList.get(parentIndex).left  = nodeList
                    .get(parentIndex * 2 + 1);
            // 右孩子
            nodeList.get(parentIndex).right = nodeList
                    .get(parentIndex * 2 + 2);
        }
        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
        int lastParentIndex = array.length / 2 - 1;
        // 左孩子
        nodeList.get(lastParentIndex).left  = nodeList
                .get(lastParentIndex * 2 + 1);
        // 右孩子,如果数组的长度为奇数才建立右孩子
        if (array.length % 2 == 1) {
            nodeList.get(lastParentIndex).right  = nodeList
                    .get(lastParentIndex * 2 + 2);
        }
        return nodeList.get(0);
    }


    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      Node head=createBinTree(array);
      printByLevel(head);
    }
    public static void printByLevel(Node head){
        if(head==null)
            return;
        Node last=head;
        Node nLast=null;
        int level =1;
        Queue<Node> queue = new LinkedList();
        queue.offer(head);
        System.out.print ("level "+level+++" :");
        while (!queue.isEmpty()){
            head=queue.poll();
            System.out.print (" "+head.value);
            if (head.left!=null){
                queue.offer(head.left);
                nLast=head.left;
            }
            if (head.right!=null){
                queue.offer(head.right);
                nLast=head.right;
            }
            if(head==last&&!queue.isEmpty()){
              System.out.println();
                System.out.print("level "+(level++)+" :");
                last=nLast;
            }
        }
    }
}
