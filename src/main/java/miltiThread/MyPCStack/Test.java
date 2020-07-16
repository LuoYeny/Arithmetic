package miltiThread.MyPCStack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:25
 */
public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        MyThreadPop thread1= new MyThreadPop(stack);
        MyThreadPop thread2= new MyThreadPop(stack);
        MyThreadPop thread3= new MyThreadPop(stack);
        MyThreadPop thread4= new MyThreadPop(stack);
        MyThreadPop thread5= new MyThreadPop(stack);
        MyThreadPush threadPush1 =new MyThreadPush(stack);
        MyThreadPush threadPush2 =new MyThreadPush(stack);
        MyThreadPush threadPush3 =new MyThreadPush(stack);
        thread1.start(); thread2.start(); thread3.start(); thread4.start(); thread5.start();
        threadPush1.start();threadPush2.start();threadPush3.start();

    }
}
