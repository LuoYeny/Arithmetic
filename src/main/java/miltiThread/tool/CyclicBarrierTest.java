package miltiThread.tool;

import java.util.concurrent.CyclicBarrier;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/8 9:32
 */
public class CyclicBarrierTest {
    static CyclicBarrier c = new CyclicBarrier(3);
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                } catch (Exception e) {
                }
                System.out.println(1);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                } catch (Exception e) {
                }
                System.out.println(4);
            }
        }).start();
        System.out.println(3);
        try {
            c.await();
        } catch (Exception e) {
        }
        System.out.println(2);
    }
}
