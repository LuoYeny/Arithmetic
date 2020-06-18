package com.jz.ch4.t28;

import java.sql.Connection;
import java.util.*;

public class Permutation {
    public ArrayList<String> array=new ArrayList<String>();
    public Set<String> vector=new HashSet<String>() {
    };
    public ArrayList<String> Permutation(String str ) {


        StringBuffer bStr=new StringBuffer(str);
        Set vector=solution(bStr,0);
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){

         //  System.out.println(iterator.next().toString());
            array.add(iterator.next().toString());
        }

        Collections.sort(array);

        return array;
    }

    private Set<String> solution(StringBuffer bStr,int index) {
        System.out.println(bStr.toString());

        for (int i = index ; i <bStr.length() ; i++) {

            StringBuffer newStr = new StringBuffer(bStr);


            char tmp= bStr.charAt(i);
            newStr.setCharAt(i,bStr.charAt(index)) ;
            newStr.setCharAt(index,tmp);
            vector.add(newStr.toString());
            solution(newStr,index+1);





        }

        return vector;
    }

    public static void main(String[] args) {
        ArrayList arrayList=   new Permutation().
                Permutation("abc");

    }

}
