package miltiThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/22 9:01
 */
class Service {
    private static ReentrantLock lock = new ReentrantLock();

    public   void m1() {
        try {
//            System.out.println(Thread.currentThread().getName()+"  m1 before");
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  m1");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"  m11");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"  m1 end");
            lock.unlock();
        }

    }


    public  static   void m2() {
        try {
//            System.out.println(Thread.currentThread().getName()+" m2 before");
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  m2");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"  m22");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"  m2 end");
            lock.unlock();
        }
    }
}

class Service1 {


    public synchronized   void m1() {
        try {
//            System.out.println(Thread.currentThread().getName()+"  m1 before");

            System.out.println(Thread.currentThread().getName()+"  m1");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"  m11");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"  m1 end");

        }

    }
    public   static   void m2() {
        try {
//            System.out.println(Thread.currentThread().getName()+" m2 before");

            System.out.println(Thread.currentThread().getName()+"  m2");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"  m22");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"  m2 end");

        }
    }
}
public class StaticTest {

    public static void main(String[] args) {
        Service service = new Service();
        Service1 service1 = new Service1();
        Runnable runnable1= new Runnable() {
            @Override
            public void run() {
                service .m2();
            }
        };
        Runnable runnable2= new Runnable() {
            @Override
            public void run() {
                service .m1();
            }
        };

        for (int i = 0; i <10 ; i++) {
            new Thread(runnable1).start();
            new Thread(runnable2).start();
        }

    }

}

