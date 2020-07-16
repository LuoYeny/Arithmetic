package miltiThread.waitAndNoyify.list5;

import Interview.huawei.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:45
 */
public class MyThread2 extends Thread {
    private Object lock;
    private MyList list ;
    public MyThread2(MyList list,Object lock) {
        this.lock = lock;
        this.list=list;
    }
    @Override
    public void run(){
        synchronized (lock){
            System.out.println(list.size());
            if (list.size()!=5){
                System.out.println("wait befor time "+System.currentTimeMillis());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait after time "+System.currentTimeMillis());
            }
        }
    }
}
