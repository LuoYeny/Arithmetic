package miltiThread.reentreLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 10:34
 */
public class test {

    public static void main1(String[] args) throws InterruptedException {
       ThreadA threadA = new ThreadA(new Resourse());
        ThreadA threadB = new ThreadA(new Resourse());
       threadA.start();
       Thread.sleep(5000);
       threadB.start();

    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(()->{
            lock.lock();
            try {
                for(;;);
            }finally {
                lock.unlock();
            }
        }).start();

        Thread.sleep(3000);
        new Thread(()->{
            lock.lock();
            try {
                for(;;);
            }finally {
                lock.unlock();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }


}
