package zuochenyun.practice.stack;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 15:06
 */
public class GetMinStack {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();
    public void push(int e){
        stack.push(e);
        if(minStack.isEmpty()||minStack.peek()>=e)
            minStack.push(e);

    }
    public int pop()   {
        if(stack.isEmpty())
            throw new RuntimeException(  "stack is empty");
        if(stack.peek()==minStack.peek())
            minStack.pop();
        return stack.pop();
    }
    public int getMin()   {
        if(minStack.isEmpty())
            throw new RuntimeException("stack is empty");
        return minStack.peek();

    }

    public static void main(String[] args) {
        GetMinStack getMinStack= new GetMinStack();
        getMinStack.push(2);
        getMinStack.push(7);
        getMinStack.push(5);
        getMinStack.push(4);
        getMinStack.push(1);
        System.out.println(getMinStack.getMin());
        getMinStack.pop();
        System.out.println(getMinStack.getMin());


    }

}
