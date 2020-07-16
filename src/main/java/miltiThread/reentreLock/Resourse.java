package miltiThread.reentreLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 10:34
 */
public class Resourse {
   private Lock lock = new ReentrantLock(true);
String  string="aaaa";
   public void m(){

       lock.lock();
       System.out.println(string);

       lock.unlock();
   }
}
