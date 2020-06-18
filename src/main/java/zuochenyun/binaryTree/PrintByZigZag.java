package zuochenyun.binaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PrintByZigZag {
    public static  void zigzag(Node head) {
        if (head == null)
            return;
        int level = 1;
        boolean lr = true;
        Node last = head;
        Node nLast = null;
        Deque<Node> deque = new LinkedList<Node>();
        deque.addFirst(head);
        printLevel(level++, lr);
        while (!deque.isEmpty()) {
            if (lr) {
                head = deque.pollFirst();
                if (head.left != null) {
                    deque.addLast(head.left);
                    nLast = nLast == null ? head.left : nLast;
                }
                if (head.right != null) {
                    deque.addLast(head.right);
                    nLast = nLast == null ? head.right : nLast;
                }
            }else {
                    head = deque.pollLast();
                    if (head.right != null) {
                        deque.addFirst(head.right);
                        nLast = nLast == null ? head.right : nLast;
                    }
                    if (head.left != null) {
                        deque.addFirst(head.left);
                        nLast = nLast == null ? head.left : nLast;
                    }
                }
            System.out.print (" "+head.value);
            if(last==head&&!deque.isEmpty()){
                lr=!lr;
                last=nLast;
                nLast=null;
                System.out.println();
                printLevel(level++, lr);
            }

        }


    }
    
    private static  void printLevel ( int level, boolean lr){
        System.out.print("Level: " + level + " from ");
        System.out.print(lr == true ? "left to right : " : "right to left : ");
    }





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
        zigzag(head);
    }
}