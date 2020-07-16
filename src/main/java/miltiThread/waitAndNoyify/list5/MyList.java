package miltiThread.waitAndNoyify.list5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:37
 */
public class MyList {
   private static List list=new ArrayList();

   public void add(String s){
       list.add(s);
   }
   public int size(){
       return list.size();
   }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
    }
}
