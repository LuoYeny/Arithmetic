package zuochenyun.binaryTree;

public class IsBalance {
    public boolean isBalance(Node head){
        boolean[] rel = new boolean[1];
        getHeight(1,head,rel);
        return rel[0];

    }

    private int getHeight(int level, Node head, boolean[] rel) {
        if(head==null)
            return level;
        int lh=getHeight(level+1,head.left,rel);
        if(!rel[0])
            return level;
        int rh=getHeight(level+1,head.right,rel);
        if(!rel[0])
            return level;
        if(Math.abs(lh-rh)>1)
           rel[0]=false;

        return Math.max(lh,rh);
    }
}
