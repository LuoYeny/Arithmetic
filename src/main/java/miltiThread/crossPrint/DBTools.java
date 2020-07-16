package miltiThread.crossPrint;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:36
 */
//黑白交替打印
public class DBTools {
    volatile private boolean posi =false;
    public synchronized void black(){
        try {
            while (posi==true){
                this.wait();
            }
            System.out.print ("★☆");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void wite(){
        try {
            while (posi==false){
                this.wait();
            }
            System.out.print ("☆");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
