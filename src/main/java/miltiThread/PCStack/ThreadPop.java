package miltiThread.PCStack;


import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 11:21
 */
public class ThreadPop extends Thread {
    public MyStack stack;

    public ThreadPop(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("pop="+stack.pop());
        }

    }
}
