package miltiThread.waitAndNoyify.list5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 11:53
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyList list = new MyList();
        Object lock = new Object();
        MyThread1 myThread1 = new MyThread1(list,lock);
        MyThread2 myThread2 = new MyThread2(list,lock);
        myThread2.start();
        Thread.sleep(1000);
        myThread1.start();;


    }
}
