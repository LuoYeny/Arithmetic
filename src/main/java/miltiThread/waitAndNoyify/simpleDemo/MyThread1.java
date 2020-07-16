package miltiThread.waitAndNoyify.simpleDemo;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:28
 */
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){

            try {
                System.out.println("wait befor time "+System.currentTimeMillis());
                lock.wait();
                System.out.println("wait after time "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
