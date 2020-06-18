package zuochenyun.stack;

import java.util.Stack;

public class Hanuota6 {
    public static void main(String[] args) {
        Stack<Integer> stackA= new Stack<Integer>();
        Stack<Integer> stackB= new Stack<Integer>();
        Stack<Integer> stackC= new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            stackA.push(i); System.out.print (i+" ");

        }
        System.out.println();
        // solution(stackA,stackC);
         fun(stackA,stackC,stackC,stackA.size());
        int len =stackC.size();
        for (int i = 0; i <len ; i++) {
            System.out.print (stackC.pop()+"  ");
        }
    }



    private static void fun(Stack<Integer> stackA, Stack<Integer> stackB,Stack<Integer> stackC,int n){
        if(n==1){
            stackC.push(stackA.pop());
                 return;
        }
        fun(stackA,stackC,stackB,n-1);
        stackC.push(stackA.pop());
        fun(stackB,stackA,stackC,n-1);

        }


    private static void solution(Stack<Integer> stackA, Stack<Integer> stackC) {
        Stack<Integer> stackB= new Stack<Integer>();
        int n=stackA.size() ;
        if(n==1) move(stackA,stackC,stackB, 1);
        else {
            move(stackA,stackB,stackC,n-1);
            move(stackA,stackC,stackB, 1);
            move(stackB,stackC,stackA,n-1);
        }

    }

    private static void   move(Stack<Integer> stackA, Stack<Integer> stackB,Stack<Integer> stackC, int n) {

//        System.out.println("x  "+x);
//        System.out.println("n  "+n);

        if(n==0)
            return  ;

        stackC.push(stackA.pop());
         move(stackA,stackB,stackC,n-1);
        stackB.push(stackC.pop());


    }
}
//    class Solution {
//        public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
//            move(A.size(),A, B, C);
//        }
//        public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C){
//            if(n == 1){
//                C.add(A.remove(A.size() - 1));
//                //注意：题目给的盘子是从大到小给的，所以这里remove的是【A.size() - 1】
//                return;
//            }
//            move(n-1,A,C,B);
//            C.add(A.remove(A.size() - 1));
//            move(n - 1, B, A, C);
//        }
//    }