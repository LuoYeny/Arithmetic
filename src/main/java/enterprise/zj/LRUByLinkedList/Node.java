package enterprise.zj.LRUByLinkedList;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/19 19:10
 */
public class Node {

        public int key, val;
        public Node next, prev;
        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }

}
