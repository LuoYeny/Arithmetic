package miltiThread.Lock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 9:01
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
       Thread.sleep(1000);
       myThread.interrupt();
    }
}
