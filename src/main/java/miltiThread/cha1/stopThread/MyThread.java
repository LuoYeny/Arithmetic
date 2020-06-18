package miltiThread.cha1.stopThread;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/15 11:41
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <1000 ; i++) {
//            if(this.isInterrupted()){
//                System.out.println("已经停止");
//                break;
//            }

            System.out.println("i= "+(i+1));

        }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("for外层");
    }
}
