package miltiThread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 10:46
 */
public class Test2 {
    ReentrantLock reentrantLock = new ReentrantLock();
    class Service{
        public void testMethodA(){
            reentrantLock.lock();
            try {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("testMethodA "+Thread.currentThread()+" "+i);
                }
            } catch (Exception e) {

                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
        public void testMethodB(){
            reentrantLock.lock();
            try {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("testMethodB "+Thread.currentThread()+" "+i);
                }
            } catch (Exception e) {

                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
    public static void main(String[] args) {

         Test2.Service service = new Test2().new Service();


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                service.testMethodA();

            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                service.testMethodB();

            }
        };

        Thread thread1= new Thread(runnable1);
        Thread thread2= new Thread(runnable1);
        Thread thread3= new Thread(runnable2);
        Thread thread4= new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
