package miltiThread.pc;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 11:12
 */
public class Test {
    public static void main(String[] args) {
       // String lock = new String("");
        Object lock = new Object();

        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();

    }
}
