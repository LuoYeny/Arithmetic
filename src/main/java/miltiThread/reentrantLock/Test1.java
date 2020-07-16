package miltiThread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 10:46
 */
public class Test1 {
    ReentrantLock reentrantLock = new ReentrantLock();
    class Service{
        public void testMethod(){
            reentrantLock.lock();
            try {
                for (int i = 0; i <5 ; i++) {
                    System.out.println(Thread.currentThread()+" "+i);
                }
            } catch (Exception e) {

                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
    public static void main(String[] args) {

         Test1.Service service = new Test1().new Service();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();

            }
        };

        Thread thread1= new Thread(runnable);
        Thread thread2= new Thread(runnable);
        Thread thread3= new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
