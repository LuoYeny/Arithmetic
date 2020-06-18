package Interview.tenxun;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);


            List<String> tempList = new LinkedList<String>();
            int fix = Integer.parseInt(sc.nextLine());

            for (int j = 0; j <fix ; j++) {
                String str = sc.nextLine ();
                tempList.add(str);
            }




        List integerList= solution(tempList);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }


    }

    private static List  solution(List< String> list) {

        List  rel=new LinkedList ();
        Queue  queue = new LinkedList();
        for (int i = 0; i <list.size() ; i++) {

                if(list.get(i) .substring(0,3).equals("add")){
                    System.out.println("add");
                    queue.offer(list.get(i) .substring(4));
                }
                if(list.get(i). equals("peek")){
                    if(queue.isEmpty())
                        rel.add(-1);
                    else rel.add( queue.peek() ) ;
                }
                if(list.get(i) .equals("poll")){
                    if(queue.isEmpty())
                        rel.add(-1);
                    else  queue.poll()   ;
                }




        }

        return rel;
    }
}
