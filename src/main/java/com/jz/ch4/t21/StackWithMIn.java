package com.jz.ch4.t21;

import java.util.Stack;

public class StackWithMIn {
    public Stack stack=new Stack();
    public Stack minStack=new Stack();
    public int min;

    public void push(int node) {

        stack.push(node);
        if(minStack.size()==0)
            minStack.push(node);
        else if ((Integer)minStack.peek()>node)
            minStack.push(node);
        else minStack.push((Integer)minStack.peek());

    }

    public void pop() {

        minStack.pop();
        stack.pop();
    }

    public int top() {

        return (Integer) stack.peek();
    }

    public int min() {

        return (Integer)minStack.peek();
    }
}
