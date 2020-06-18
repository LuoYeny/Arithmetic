package com.jz.ch4.t22;

import java.util.Stack;

public class InPopOder {
    public static boolean isPopOrder(int [] pushA,int [] popA) {


        Stack<Integer> stack = new Stack();
        boolean result=false;
        int popNext=0;
        int pushNext =0;
        while (popNext<popA.length){
            while (stack.size()==0||stack.peek()!=popA[popNext]){
                if(pushNext>pushA.length-1)
                    break;
                stack.add(pushA[pushNext]);
                pushNext++;

            }
            if(stack.peek()!=popA[popNext])
                break;

            stack.pop();
            popNext++;
        }
        System.out.println("pushNext "+pushNext);
        System.out.println("popNext "+popNext);
        if(stack.empty()&&pushNext==pushA.length)
            result=true;

        return result;


    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,5,3,2,1};
        isPopOrder(a,b);
    }
}
