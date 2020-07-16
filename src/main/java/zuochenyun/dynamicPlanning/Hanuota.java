package zuochenyun.dynamicPlanning;
import java.util.Stack;
/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 17:00
 */
public class Hanuota {
    //数据移动
    public void hanuota(Stack<Integer> stacKA,Stack<Integer> stacKB,Stack<Integer> stacKC,int n){
        if(n==1){
            stacKC.push(stacKA.pop());
            return;
        }
        //把n-1个移动到B
        hanuota(stacKA,stacKC,stacKB,n-1);
        stacKC.push(stacKA.pop());//把剩下一个移动到C
        hanuota(stacKB,stacKA,stacKC,n-1);//把B中n-1个全部移动到C
    }
    //移动轨迹
    public void hanuota2(String stackA,String stackB,String stackC,int n){
        if(n==1){
            System.out.println("move from "+stackA+" to "+stackC);
        }else {
            hanuota2(stackA,stackC,stackB,n-1);
            hanuota2(stackA,stackB,stackC,1);
            hanuota2(stackB,stackA,stackC,n-1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stackA= new Stack<Integer>();
        Stack<Integer> stackB= new Stack<Integer>();
        Stack<Integer> stackC= new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            stackA.push(i); System.out.print (i+" ");

        }
        System.out.println();
        new Hanuota().hanuota(stackA,stackB,stackC,stackA.size());
        new Hanuota().hanuota2("stackA","stackB","stackC",2);

        int len =stackC.size();
        for (int i = 0; i <len ; i++) {
            System.out.print (stackC.pop()+"  ");
        }
    }
}
