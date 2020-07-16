package miltiThread.PCStack;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 11:04
 */
public class MyStack {

    List<String> list = new LinkedList<>();
    Random random = new Random(20);
    synchronized public String pop(){
        String returnValue ="";
        try {
            while (list.size()==0){
                System.out.println("pop操作中的  "+Thread.currentThread().getName()+"  正在waiting");
                this.wait();
            }
            returnValue=""+list.get(list.size()-1);
            list.remove(list.size()-1);
            this.notifyAll();
            System.out.println("pop后 list.size()="+list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    synchronized public void push(){

        try {
            while (list.size()==1){
                System.out.println("push操作中的  "+Thread.currentThread().getName()+"  正在waiting");
                this.wait();
            }
            list.add("some"+random.nextInt(100));
            this.notifyAll();
            System.out.println("push后 list.size()="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
