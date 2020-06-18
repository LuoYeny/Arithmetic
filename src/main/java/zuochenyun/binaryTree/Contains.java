package zuochenyun.binaryTree;

public class Contains {
    public boolean contians(Node h1,Node h2){
       return check(h1,h2)||contians(h1.left,h2)||contians(h1.right,h2);
    }

    private boolean check(Node h1, Node h2) {
        if(h2==null)
            return true;
        if(h1==null||h1.value!=h2.value)
            return false;
        return check(h1.left,h2.left)&&check(h1.right,h2.right);
    }
}
