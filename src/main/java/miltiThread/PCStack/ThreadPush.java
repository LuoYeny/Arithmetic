package miltiThread.PCStack;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 11:21
 */
public class ThreadPush extends Thread {
    public MyStack stack;

    public ThreadPush(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            stack.push();
        }

    }
}
