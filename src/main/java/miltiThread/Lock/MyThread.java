package miltiThread.Lock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 8:54
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            new InterruptLock().demo1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
