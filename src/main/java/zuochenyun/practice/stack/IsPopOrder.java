package zuochenyun.practice.stack;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 16:57
 */
public class IsPopOrder {
    public static boolean isPopOrder(int[] pushOrder,int[] popOrder){

        int index=0;
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i <popOrder.length ; i++) {
            while ((stack.isEmpty()||stack.peek()!=popOrder[i])&&index<pushOrder.length)
                stack.push(pushOrder[index++]);

           if(stack.peek()==popOrder[i]) stack.pop();

        }
        return stack.isEmpty();
    }


}
