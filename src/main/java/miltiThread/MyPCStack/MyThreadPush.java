package miltiThread.MyPCStack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:23
 */
public class MyThreadPush extends Thread{
    MyStack stack = new MyStack();

    public MyThreadPush(MyStack stack) {
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
