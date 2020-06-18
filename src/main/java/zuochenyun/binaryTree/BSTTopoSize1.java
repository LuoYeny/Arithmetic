package zuochenyun.binaryTree;

public class BSTTopoSize1 {
    public int bstTopoSize(Node head){
        if(head==null)
            return 0;
        int max=maxTopo(head,head);
         max= Math.max(bstTopoSize(head.left),max);
          max= Math.max(bstTopoSize(head.right),max);
          return max;
    }

    private int maxTopo(Node head, Node n) {
        if(head!=null&&n!=null&&isBSTNode(head,n,n.value)){
            int max=maxTopo(head,n.left)+maxTopo(head,n.right)+1;
            return max;

        }
        return 0;
    }

    private boolean isBSTNode(Node head, Node n, int value) {
        if(head==null)
            return false;
        if(head==n)
            return true;
        return isBSTNode(head.value>value?head.left:head.right,n,value);
    }
}
