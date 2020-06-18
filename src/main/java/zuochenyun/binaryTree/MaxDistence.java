package zuochenyun.binaryTree;

public class MaxDistence {
    public int maxDistence(Node head){
        int[] record=new int[1];
        int rel = posOder(record,head);

        return rel;
    }

    private int posOder(int[] record, Node head) {
        if(head==null){
            record[0]=0;
            return 0;
        }
       int maxl= posOder(record,head.left);//左子树上的最大距离
       int maxformleft= record[0];//左子树到左孩子结点的最大距离
        int maxr= posOder(record,head.right);
        int maxformright= record[0];


        int curmax=maxformleft+maxformright+1;
        record[0]=Math.max(maxformleft,maxformright)+1;

        return Math.max(curmax,Math.max(maxl,maxr));
    }
}
