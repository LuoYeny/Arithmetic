package miltiThread.reentrantLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 11:33
 */
//消费者和生产者
public class CAndP {


    class servce{
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        List<Integer> list = new ArrayList<>();
        boolean flag =true;


        public void C(){
            lock.lock();
            try {
                while (list.size()==0){
                    System.out.println("消费者等待  ");
                    condition.await();
                }

                list.remove(list.size()-1);
                System.out.println("C 消费了");
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
        public void P(){
            lock.lock();
            try {
                while (list.size()>=1){

                    System.out.println("生产者等待  ");
                    condition.await();
                }

                list.add(1);
                System.out.println(" P 生产了。。");
                System.out.println("list.size()  "+list.size());
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {
        CAndP.servce servce = new CAndP().new servce();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                    servce.P();


            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {

                    servce.C();


            }
        };
        for (int i = 0; i <20 ; i++) {
            new Thread(runnable).start();
            new Thread(runnable1).start();
        }

    }
}
