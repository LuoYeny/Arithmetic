package mine.recursion;

public class FrogAndStep {

    /**
     * 每次跳的时候，小青蛙可以跳一个台阶，也可以跳两个台阶，也就是说，每次跳的时候，小青蛙有两种跳法。
     *第一种跳法：第一次我跳了一个台阶，那么还剩下n-1个台阶还没跳，剩下的n-1个台阶的跳法有f(n-1)种。
     *第二种跳法：第一次跳了两个台阶，那么还剩下n-2个台阶还没，剩下的n-2个台阶的跳法有f(n-2)种。
     *所以，小青蛙的全部跳法就是这两种跳法之和了，即 f(n) = f(n-1) + f(n-2)。至此，等价关系式就求出来了。于是写出代码：
     *
     */
    public static void main(String[] args) {
        int high=10;
        //递归要做的事情
        int rel =solution(high);
    }

    private static int solution(int high) {
        //递归结束条件
        if(high<=2)
            return high;

        return solution(high-1)+solution(high-2);

    }
}
