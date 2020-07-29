package practiceAll.permutation;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 17:33
 */
public class Priority {
    class Node implements Comparable<Node> {
        int value;
        int name;

        public Node(int value, int name) {
            this.value = value;
            this.name = name;
        }

        @Override
        public int compareTo(Node o) {
            return 0;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }); //大顶堆
        queue.add(2);
        queue.add(4);
        queue.add(5);
        queue.add(7);
        queue.add(1);



        System.out.println(queue.poll());

    }
}
