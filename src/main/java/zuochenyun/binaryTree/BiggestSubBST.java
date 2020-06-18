package zuochenyun.binaryTree;

public class BiggestSubBST {
    public Node biggestSubBST(Node head){
        int[] record=new int[3];
        return posOrder(head,record);

    }

    private Node posOrder(Node head, int[] record) {
        if(head==null){
            record[0]=0;
            record[1]=Integer.MAX_VALUE ;//树中的最小值
            record[2]=Integer.MIN_VALUE;//树中的最大值
            return null;
        }
        int value =head.value;
        Node left =head.left;
        Node right=head.right;
       Node lBST= posOrder(left,record);
        int lSize=record[0];
        int lMin=record[1];
        int lMax=record[2];
        Node rBST= posOrder(left,record);
        int rSize=record[0];
        int rMin=record[1];
        int rMax=record[2];
        record[1]=Math.min(value,lMin);
        record[2]=Math.max(value,rMax);

        if(left ==lBST&&rBST==right&&value>=lMax&&value<=rMin){
            record[0]=lSize+rSize+1;
            return head;
        }
        record[0]=Math.max(lSize,rSize);
        return lSize>=rSize?lBST:rBST;
    }
}
