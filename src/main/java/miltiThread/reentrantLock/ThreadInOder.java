package miltiThread.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 10:55
 */
//顺序执行
public class ThreadInOder {
    volatile private static int nextThread=1;
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition1= lock.newCondition();
    private static Condition condition2= lock.newCondition();
    private static  Condition condition3=lock.newCondition();
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (nextThread!=1){
                        condition1.await();
                    }
                    for (int i = 0; i <5 ; i++) {
                        System.out.println("thread1 : "+i);
                    }
                    nextThread=2;
                    condition2.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (nextThread!=2){
                        condition2.await();
                    }
                    for (int i = 0; i <5 ; i++) {
                        System.out.println("thread2 : "+i);
                    }
                    nextThread=3;
                    condition3.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (nextThread!=3){
                        condition3.await();
                    }
                    for (int i = 0; i <5 ; i++) {
                        System.out.println("thread3 : "+i);
                    }
                    nextThread=1;
                    condition1.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }).start();
    }
}
