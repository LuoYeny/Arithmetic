package zuochenyun.binaryTree;

public class NodeNum {
    public int nodeNum(Node head){
        if(head==null)
            return 0;
        int rel=bs(head,1,mostLeftLevel(head,1));
        return rel;
    }

    private int bs(Node head, int level, int h) {
        if(level==h)
            return 1;
        if(mostLeftLevel(head.right,level+1)==h){
            return (1<<(h-level))+bs(head.right,level+1,h);
        }else  return (1<<(h-level-1))+bs(head.left,level+1,h);
    }


    private int mostLeftLevel(Node head,int level){
        while (head!=null){
            level++;
            head=head.left;
        }
        return level-1;

    }
}
