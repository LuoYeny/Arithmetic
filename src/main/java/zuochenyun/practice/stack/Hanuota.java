package zuochenyun.practice.stack;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/7 16:02
 */
public class Hanuota {
    public void hanuota(Stack<Integer> stackA,Stack<Integer> stackB,Stack<Integer> stackC,int n){
        if(n==1){
            stackC.push(stackA.pop());
            return;
        }
        hanuota(stackA,stackC,stackB,n-1);//把A中n-1个全部移动到B
        stackC.push(stackA.pop());//把剩下一个移动到C
        hanuota(stackB,stackA,stackC,n-1);//把B中n-1个全部移动到C

    }
}
