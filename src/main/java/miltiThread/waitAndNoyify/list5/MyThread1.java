package miltiThread.waitAndNoyify.list5;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:40
 */
public class MyThread1 extends Thread {
    private Object lock;
    private MyList list ;

    public MyThread1(MyList list,Object lock) {
        this.list = list;
        this.lock=lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            for (int i = 0; i <10 ; i++) {
                list.add("mm"+i);
                if(list.size()==5){

                    lock.notify();
                    System.out.println("发出通知 "+System.currentTimeMillis());
                }

                System.out.println("添加了  "+i +" 个元素");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
