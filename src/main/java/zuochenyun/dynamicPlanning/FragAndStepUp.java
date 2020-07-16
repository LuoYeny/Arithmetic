package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 15:14
 */
public class FragAndStepUp {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    // 求该青蛙跳上一个n级的台阶总共有多少种跳法。
    //f(n) = f(n-1) + f(n-1) = 2 * f(n-1)
    //或f(n)=2^(n-1)。

    public int fibonacci1(int n){
        if(n==1)
            return 1;

        return 2*fibonacci1(n-1);
    }


    public int fibonacci2(int n){
        if(n<=0)
            return 0;
        int res=1;
        for (int i = 1; i <n ; i++) {
            res=2*res;
        }
        return res;
    }
}
