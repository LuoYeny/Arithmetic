package zuochenyun.practice.stack;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 15:29
 */
public class SortStackByStack {
    public void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> temStack= new Stack<>();
        int tmp;
            while (!stack.isEmpty()){
            tmp=stack.pop();
            while (!temStack.isEmpty()&&temStack.peek()>tmp){
                stack.push(temStack.pop());
            }
            temStack.push(tmp);

        while (!temStack.isEmpty()){
            stack.push(temStack.pop());
        }

      }

    }
}
