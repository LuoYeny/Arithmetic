package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 15:42
 */
//找到一个节点的后继节点
public class GetNextNode {
    public DoubleNode getNextNode(DoubleNode head){
        //当前节点右子树的最左节点
        //当前节点为父节点的左孩子-----父节点
        //不断向上寻父节点--直到当前子树为父节点的左子树---父节点

        if(head==null)
            return null;
        if(head.right!=null){
            return getLeftMost(head.right);
        }else {
            DoubleNode parant=head.parent;
            while (parant!=null&&parant.left!=head){
                head=parant;
                parant=parant.parent;

            }

            return parant;


        }


    }

    private DoubleNode getLeftMost(DoubleNode node) {
        if(node==null)
            return null;
        while (node.left!=null){
            node=node.left;
        }

        return node;
    }
}
