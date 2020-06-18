package Interview.tenxun;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<List<String>> list = new LinkedList<List<String>>();
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <count ; i++) {
            List<String> tempList = new LinkedList<String>();
            int fix = Integer.parseInt(sc.nextLine());

            for (int j = 0; j <fix ; j++) {
               String str = sc.nextLine ();
               tempList.add(str);
            }

            list.add(tempList);
        }

    List integerList= solution(list);
        for (int i = 0; i < integerList.size(); i++) {
           int a=  Integer.valueOf(integerList.get(i).toString()).intValue();
            System.out.println(a );
        }


    }

    private static List  solution(List<List<String>> list) {

        List  rel=new LinkedList ();
        Queue  queue = new LinkedList();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.get(i).size() ; j++) {

                if(list.get(i).get(j).substring(0,2).equals("PU")){

                    queue.offer(list.get(i).get(j ).substring(5));
                }

                if(list.get(i).get(j).equals("TOP")){
                    if(queue.isEmpty())
                        rel.add(-1);
                    else rel.add( queue.peek() ) ;
                }
                if(list.get(i).get(j).equals("POP")){
                    if(queue.isEmpty())
                        rel.add(-1);
                     queue.poll()   ;
                }
                if(list.get(i).get(j).equals("SIZE")){
                     rel.add(queue.size());
                }
                if(list.get(i).get(j).equals("CLEAR")){
                    int size=queue.size();
                    for(int N=0;N<size;N++){
                        queue.poll();//移除元素
                    }
                }

            }
        }

        return rel;
    }
}
