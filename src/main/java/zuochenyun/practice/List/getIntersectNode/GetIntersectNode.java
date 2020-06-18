package zuochenyun.practice.List.getIntersectNode;

import zuochenyun.practice.List.Node;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/11 16:26
 */
public class GetIntersectNode {
    public Node getIntersectNode(Node head1,Node head2){
        Node loop1=new GetNoopNode().getNoopNode(head1);
        Node loop2=new GetNoopNode().getNoopNode(head2);

        if(loop1!=null&&loop2!=null){
            return new BothLoop().bothLoop(head1,loop1,head2,loop2);
        }
        if(loop1==null&&loop2==null)
        return new NoLoop().noLoop(head1,head2);

        return null;

    }
}
