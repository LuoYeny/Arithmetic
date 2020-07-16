package miltiThread.PCStack;


import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 11:27
 */
public class Test {
    public static void main(String[] args) {
        MyStack mystack = new MyStack( );
        ThreadPop threadPop = new ThreadPop(mystack);
        ThreadPop threadPop2 = new ThreadPop(mystack);
        ThreadPop threadPop3 = new ThreadPop(mystack);
        ThreadPop threadPop4 = new ThreadPop(mystack);
        ThreadPop threadPop5 = new ThreadPop(mystack);


        ThreadPush threadPush= new ThreadPush(mystack);
        threadPop.start();
        threadPop2.start();
        threadPop3.start();
        threadPop4.start();
        threadPop5.start();

        threadPush.start();
    }

}
