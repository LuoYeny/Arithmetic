package zuochenyun.binaryTree;

public class PostArrayToBST {
    public Node postArrayToBST(int[] arr){
        if(arr==null||arr.length==0){
            return null;
        }
        Node head = postToBST(arr,0,arr.length-1);
        return head;

    }

    private Node postToBST(int[] arr, int start, int end) {
        if(start>end)
            return null;
        Node head = new Node(arr[end]);
        int less=-1;
        int more=end;
        for (int i = start; i <end ; i++) {
            if(arr[end]>arr[i])
                less=i;
            else more=more==end?i:more;
        }

        head.left=postToBST(arr,start,less);
        head.right=postToBST(arr,more,end-1);
        return head;
    }
}
