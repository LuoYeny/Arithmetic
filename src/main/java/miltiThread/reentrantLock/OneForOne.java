package miltiThread.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 11:33
 */
//交替打印
public class OneForOne {


    class servce{
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        boolean flag =true;


        public void m1(){
            lock.lock();
            try {
                while (flag){

                    condition.await();
                }
                System.out.println("☆");
                flag=true;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
        public void m2(){
            lock.lock();
            try {
                while (!flag){

                    condition.await();
                }
                System.out.println("★");
                flag=false;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {
        OneForOne.servce servce = new OneForOne().new servce();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    servce.m1();
                }

            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    servce.m2();
                }

            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }
}
