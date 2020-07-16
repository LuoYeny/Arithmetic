package miltiThread.crossPrint;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 12:38
 */
public class Test {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        MyThread myThread= new MyThread(dbTools);
        MyThread1 myThread1= new MyThread1(dbTools);
        myThread.start();
        myThread1.start();

    }
}
