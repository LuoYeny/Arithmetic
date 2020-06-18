package zuochenyun.practice.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 16:30
 */
public class GetMaxWindow {
    public static int[] getMaxWindow(int[] arr,int win){
        if(arr==null||arr.length<win||win<1)
            return null;
        Deque<Integer> deque= new LinkedList<>();
        int[] res=new int[arr.length-win+1];
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            //deque的添加操作
            while (!deque.isEmpty()&&arr[i]>=arr[deque.getLast()])
                deque.pollLast();
            deque.offerLast(i);

            //deque的移除操作
            if(deque.getFirst()==i-win)
                deque.pollFirst();

            if(i>=win-1)
                res[index++]=arr[deque.getFirst()];

        }
        return res;
    }

    public static void main(String[] args) {
        int[] a= {4,3,5,4,3,3,6,7};
        int[] res=getMaxWindow(a,3);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
