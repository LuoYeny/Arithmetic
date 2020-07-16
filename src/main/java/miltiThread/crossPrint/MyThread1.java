package miltiThread.crossPrint;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:41
 */
public class MyThread1 extends Thread {
    DBTools dbTools = new DBTools();

    public MyThread1(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
         while (true){
             dbTools.wite();
         }
    }
}
