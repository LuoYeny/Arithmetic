package miltiThread.reentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 11:25
 */
public class WriteLock {
    public class Service{
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        public void read(){
            try {
                lock.readLock().lock();
                for (; ; ) {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+" get readLock ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }
    }


    public static void main(String[] args) {
        WriteLock.Service service = new WriteLock().new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.read();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
