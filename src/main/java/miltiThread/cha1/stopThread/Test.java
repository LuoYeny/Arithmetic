package miltiThread.cha1.stopThread;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/15 11:43
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1 "+thread.isInterrupted());
            System.out.println("是否停止2 "+thread.isInterrupted());

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
