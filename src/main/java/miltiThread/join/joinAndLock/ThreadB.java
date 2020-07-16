package miltiThread.join.joinAndLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 11:07
 */
public class ThreadB extends Thread{
    private ThreadA threadA;

    public ThreadB(ThreadA threadA) {
        super();
        this.threadA = threadA;
    }

    @Override
    public void run() {

            try {
                synchronized(threadA) {
                    System.out.println("ThreadB begin");

                    threadA.start();
                    threadA.join();

                    System.out.println("ThreadB end");
                }
            } catch (InterruptedException e) {
                System.out.println("B");
                e.printStackTrace();
            }

    }
}
