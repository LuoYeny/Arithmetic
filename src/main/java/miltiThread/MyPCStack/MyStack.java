package miltiThread.MyPCStack;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 11:09
 */
public class MyStack {
    private List<String> list=new LinkedList<>();
    Random random= new Random();


    public synchronized String pop(){
        String removeValue="";
        try {
            while (list.size()==0){
                System.out.println(Thread.currentThread()+"在pop中的waiting");
                this.wait();
            }
            removeValue=""+list.get(list.size()-1);
            list.remove(list.size()-1);
            System.out.println("pop后 list.size ="+list.size());

            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return removeValue;
    }

    public synchronized void push(){
        try {
            while (list.size()==3){
                System.out.println(Thread.currentThread()+"在push中的waiting");
                this.wait();
            }
            list.add("nn"+random.nextInt(100));
            this.notifyAll();
            System.out.println("push后 list.size ="+list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
