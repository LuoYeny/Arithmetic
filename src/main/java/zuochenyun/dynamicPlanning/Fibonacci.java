package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 15:14
 */
public class Fibonacci {
    //斐波那契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=Fn-1+Fn-2（n>=2，n∈N*），
    // 用文字来说，就是斐波那契数列列由 0 和 1 开始，之后的斐波那契数列系数就由之前的两数相加。
    public int fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==2||n==1)
            return 1;
        int res=1;
        int pre=1;
        int tmp=0;


        for (int i = 3; i <=n ; i++) {
            tmp=res;
            res=pre+res;
            pre=tmp;

        }
        return res;


    }
}
