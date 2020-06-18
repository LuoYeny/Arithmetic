package zuochenyun.binaryTree;

public class GenerateTree {
    public Node generateTree(int[] arr){
        if(arr==null||arr.length==0)
            return null;
        Node head =toGenerateTree(arr,0,arr.length-1);
        return head;

    }

    private Node toGenerateTree(int[] arr, int start, int end) {
        if(start>end)
            return null;
        int mid =(start+end)/2;
        Node node = new Node(arr[mid]);
        node.left=toGenerateTree(arr,start,mid-1);
        node.right=toGenerateTree(arr,mid+1,end);
        return node;
    }
}
