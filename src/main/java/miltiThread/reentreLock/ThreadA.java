package miltiThread.reentreLock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 10:34
 */
public class ThreadA extends Thread {
    Resourse resource  ;

    public ThreadA(Resourse resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        resource.m();

    }
}
