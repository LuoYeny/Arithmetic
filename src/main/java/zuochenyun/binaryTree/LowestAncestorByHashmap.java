package zuochenyun.binaryTree;

import java.util.HashMap;
import java.util.HashSet;

public class LowestAncestorByHashmap {
    public HashMap<Node, Node> map;

    public LowestAncestorByHashmap(Node head) {
          map=new HashMap<Node, Node>();
          if(head!=null){
              map.put(head,null);
          }
          setMap(head);
    }

    private void setMap(Node head) {
        if(head==null)
            return;
        if(head.left!=null)
            map.put(head.left,head);
        if(head.right!=null)
            map.put(head.right,head);

        setMap(head.left);
        setMap(head.right);
    }

    public Node query(Node o1,Node o2){
        HashSet<Node> set = new HashSet<Node>();
        while (map.containsKey(o1)){
            set.add(map.get(o1));
            o1=map.get(o1);
        }
        while (!set.contains(o2)){
            o2=map.get(o2);
        }
        return o2;
    }
}

