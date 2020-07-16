package miltiThread.join.joinAndLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 11:07
 */
public class ThreadC extends Thread{
    private ThreadA threadA;

    public ThreadC(ThreadA threadA) {
        super();
        this.threadA = threadA;
    }

    @Override
    public void run() {

           threadA.m1();

    }
}
