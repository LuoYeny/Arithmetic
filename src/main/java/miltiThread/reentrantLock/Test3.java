package miltiThread.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 11:13
 */
public class Test3 {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    private String  s="e";
    class Service{
        public void testMethodA(){
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread()+"  signal start");
                while (!s.equals("m")){
                    s="m";
                    condition.signal();
                }
                System.out.println(Thread.currentThread()+"  signal end");

            } catch (Exception e) {

                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
        public void testMethodB(){
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread()+"  await start");
                   while (!s.equals("m"))
                       condition.await();
                   s="e";
                System.out.println(Thread.currentThread()+"  await end");
            } catch (Exception e) {

                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Test3.Service service = new Test3().new Service();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                service.testMethodB();

            }
        };


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                service.testMethodA();

            }
        };


        Thread thread1= new Thread(runnable1);
        Thread thread2= new Thread(runnable1);
        Thread thread3= new Thread(runnable2);
        Thread thread4= new Thread(runnable2);

        thread3.start();
        thread4.start();

        thread1.start();
        thread2.start();

    }
}
