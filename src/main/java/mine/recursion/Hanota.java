package mine.recursion;

import java.util.ArrayList;
import java.util.List;

public class Hanota {
    public static void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {


        System.out.println("A.size  "+A.size());
        if(A==null)
            return;
        if(A.size()==1){
          Integer top=  A.remove(A.size()-1);
            System.out.println("1 top"+top);
          C.add(top);

        }

        else  if(A.size()==2){
            Integer top=  A.remove(A.size()-1);
            B.add(top);
            Integer bottom=  A.remove(A.size()-1);
            C.add(bottom);
            System.out.println("2 top"+top);
            System.out.println("2 bottom"+bottom);
            C.add(B.remove(B.size()-1));
            System.out.println("2 A.size  "+A.size());
        }


            hanota(A.subList(0,A.size()-1),B,C);



    }

    public static void recursion(List<Integer> A, List<Integer> B, List<Integer> C,int n){
        

    }
    public static void main(String[] args) {
        List<Integer> A =new ArrayList<Integer>();
        List<Integer> B=new ArrayList<Integer>();
        List<Integer> C=new ArrayList<Integer>();
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(1);
        hanota(A,B,C);

        for (int i = 0; i <C.size()  ; i++) {
            System.out.println("C["+i+"] ="+C.get(i));
        }

    }
}
