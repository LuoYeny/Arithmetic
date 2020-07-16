package miltiThread.tool;

import java.util.concurrent.CountDownLatch;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/8 9:16
 */
public class CountDownLatchTest {
   static CountDownLatch c = new CountDownLatch(2);
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(6);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(2);
                c.countDown();
                System.out.println(5);
            }
        }).start();
        System.out.println("3");
        c.await();
        System.out.println("4");

    }
}
