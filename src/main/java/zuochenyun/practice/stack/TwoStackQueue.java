package zuochenyun.practice.stack;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 15:18
 */
public class TwoStackQueue {
    private Stack<Integer> pushStack= new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

    public void offer(int e){
        popStack.push(e);

    }
    public int poll(){
        if(popStack.isEmpty()&&pushStack.isEmpty())
            throw new RuntimeException("queue is empty");
        if(popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();

    }
    public int peek(){
        if(popStack.isEmpty()&&pushStack.isEmpty())
            throw new RuntimeException("queue is empty");
        if(popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();

    }
}
