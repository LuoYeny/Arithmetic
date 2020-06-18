package zuochenyun.binaryTree;

import zuochenyun.list.JosehusKill6;

public class GetNextNode {
    private static class Node{
        int value;
        Node left = null;
        Node right = null;
        Node parent = null;
        public Node(int value){
            this.value=value;
        }

    }

    public Node getNextNode(Node node){
        if(node==null)
            return node;

        if(node.right!=null){
            return  getLeftMost(node.right);
        }else {
            Node parent =node.parent;
            if(parent!=null&&parent.left!=node){
                node=parent;
                parent=node.parent;
            }
            return parent;
        }
    }

    private Node getLeftMost(Node node) {
        if(node==null)
            return node;

        while (node.left!=null){
            node=node.left;
        }
        return node;
    }
}
