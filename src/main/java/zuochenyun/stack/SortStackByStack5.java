package zuochenyun.stack;

import java.util.Scanner;
import java.util.Stack;

public class SortStackByStack5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Stack stack=new Stack<Integer>();
        for (int i = 0; i <n ; i++) {
            int temp =sc.nextInt();

            stack.push(temp);
        }

      Stack rel=  solution2 (stack);
        int length=rel.size();
        for (int i = 0; i <length ; i++) {
            System.out.print (  rel.pop()+"  ");
        }
    }

    private static Stack<Integer> solution(Stack<Integer> stack) {
        if(stack.empty())
            return null;
        Stack<Integer> tempStack = new Stack();
        if(tempStack.empty())
            tempStack.push(stack.pop());

        while (!stack.empty()){
            int count=0;
           int cur=stack.pop();
           if(cur>tempStack.peek())
               tempStack.push(cur);
           else {
               while (!tempStack.empty()&&cur<tempStack.peek()){
                   stack.push(tempStack.pop());
                   count++;
               }
               tempStack.push(cur);
               while (count!=0){
                   tempStack.push(stack.pop());
                   count--;
               }
           }

        }

return tempStack;
    }
    private static Stack<Integer> solution2(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack();
        while (!stack.empty()){
            int cur = stack.pop();
            while (!tempStack.empty()&&tempStack.peek()>cur){

               stack.push(tempStack.pop());
            }
            tempStack.push(cur);
        }
        return tempStack;
    }
}
