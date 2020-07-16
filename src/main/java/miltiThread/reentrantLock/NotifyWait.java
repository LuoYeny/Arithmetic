package miltiThread.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 11:47
 */
public class NotifyWait {
    class Service{
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        public void m1(){
            try {
                lock.lock();
                System.out.println("enter m1");
                condition.await();

                System.out.println("end m1");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("锁释放了 m1");
                lock.unlock();
            }
        }
        public void m2(){
            try {
                lock.lock();
                System.out.println("enter m2");
                condition.signal();

                System.out.println("end m2");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("锁释放了 m2");
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
         NotifyWait.Service service = new NotifyWait().new Service();
          new Thread(new Runnable() {
            @Override
            public void run() {
                service.m1();

            }
        }).start();
          Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                 service.m2();
            }
        }).start();

    }
}
