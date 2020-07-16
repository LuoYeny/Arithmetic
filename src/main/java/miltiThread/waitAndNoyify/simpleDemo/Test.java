package miltiThread.waitAndNoyify.simpleDemo;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:33
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock =new Object();
        MyThread1 myThread1 = new MyThread1(lock);
        MyThread2 myThread2 = new MyThread2(lock);
        myThread1.start();
        Thread.sleep(1000);
        myThread2.start();

    }
}
