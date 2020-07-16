package miltiThread.Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 8:55
 */
public class InterruptLock {
    ReentrantLock lock =new ReentrantLock();
    public void demo1()throws InterruptedException {
        lock.lockInterruptibly();
        try {
            for (int i = 0; ; i++) {

                System.out.println("i :"+i);


            }
        }finally {
            lock.unlock();
        }


    }
}
