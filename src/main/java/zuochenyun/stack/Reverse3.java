package zuochenyun.stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Stack stack=new Stack<Integer>();
        for (int i = 0; i <n ; i++) {
            int temp =sc.nextInt();

            stack.push(temp);
        }

         reverse(stack);

        int length=stack.size();
        for (int i = 0; i <length ; i++) {
            System.out.print (  stack.pop()+"  ");
        }
    }

    private static int  solution(Stack<Integer> stack) {
        int x= stack.pop();
        if(stack.empty())
            return x;

        int y =solution(stack);
        stack.push(x);
        return y;
    }

    private static   void reverse(Stack<Integer> stack){
        if(stack.empty())
            return;
        int x= solution(stack);
        reverse(stack);
        stack.push(x);

    }

}
