package Interview.meituan;

import java.lang.reflect.Array;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starNum=sc.nextInt();
        List<List> list = new LinkedList<List>();

        for (int i = 0; i <starNum ; i++) {
            List<Integer> xy = new LinkedList<Integer>();
            int x= sc.nextInt();
            int y=sc.nextInt();
           xy.add(x);
           xy.add(y);
           list.add(xy);
        }

     int rel = solution(starNum,list);
        System.out.println(rel);
    }

    private static int solution(int starNum, List<List> list) {
        if(starNum<4)
            return 0;
        int rel=0;
        for (int i = 0; i < starNum; i++) {
            boolean flagx1=false;
            boolean flagx2=false;
            boolean flagy1=false;
            boolean flagy2=false;
            List temp = list.get(i);
            for (int j = 0; j <starNum ; j++) {
              //  System.out.println(1);
                if( temp.get(0).equals(list.get(j).get(0))&&j!=i){
                 //   System.out.println(2);
                    if((Integer)temp.get(1) >(Integer) list.get(j).get(1)  ){
                        flagx1=true;
                    }
                    if((Integer)temp.get(1) <(Integer) list.get(j).get(1)  ){
                        flagx2=true;
                    }
                }
               // System.out.println(3);
                if( temp.get(1).equals(list.get(j).get(1))&&j!=i){
                //    System.out.println(4);
                    if((Integer)temp.get(0) >(Integer) list.get(j).get(0)  ){
                        flagy1=true;
                    }
                    if((Integer)temp.get(0) <(Integer) list.get(j).get(0)  ){
                        flagy2=true;
                    }
                }


            }

            if(flagx1&&flagx2&&flagy1&&flagy2)
                rel++;

        }
        return rel;

    }
}
