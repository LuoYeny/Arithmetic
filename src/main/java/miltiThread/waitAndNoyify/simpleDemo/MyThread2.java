package miltiThread.waitAndNoyify.simpleDemo;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:31
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){


                System.out.println("notify begin time "+System.currentTimeMillis());
                lock.notify();
                System.out.println("notify after time "+System.currentTimeMillis());


        }


    }
}
