package miltiThread.MyPCStack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:23
 */
public class MyThreadPop extends Thread{
    MyStack stack = new MyStack();

    public MyThreadPop(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println(stack.pop());
        }
    }
}
