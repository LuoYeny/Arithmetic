package miltiThread.waitAndNoyify.wn3_1_14;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 11:07
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread1 thread1 = new Thread1(lock);
        thread1.start();
        Thread1_1 thread1_1 = new Thread1_1(lock);
        thread1_1.start();
        Thread.sleep(1000);
        Thread2 thread2 = new Thread2(lock);
        thread2.start();
    }
}
