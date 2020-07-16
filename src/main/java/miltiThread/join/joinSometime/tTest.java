package miltiThread.join.joinSometime;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 10:59
 */
public class tTest {

    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join(2000);
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
