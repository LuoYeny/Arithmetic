package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 15:14
 */
public class FragAndStep {
    //一次跳一个台阶或者两个台阶
    public int fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==2||n==1)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
