package zuochenyun.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GetMaxWindow7 {
    public static void main(String[] args) {
        int []arr = {2,4,7,9,5,6,3,11,1};
        int window=3;
         List rel = solution(arr,window);
        System.out.println(rel);
    }

    private static  List<Integer> solution(int[] arr, int window) {
        List<Integer> list = new LinkedList<Integer>();
        if(arr==null||window<1||arr.length<window)
            return null;
        Queue<Integer> queue = new LinkedList<Integer>();
        int len=arr.length;
        int index=0;
        while (index<len){
                while (!queue.isEmpty()&&arr[index]>=queue.peek()){
                    queue.poll();
            }
            queue.offer(index);
            if(queue.peek()==index-window){
                queue.poll();
            }
            if(queue.peek()>index-window)
                list.add(arr[queue.peek()]);


            index++;
        }
        return list;

    }
}
