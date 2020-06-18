package com.jz.ch5.t30;

import java.util.ArrayList;
import java.util.Collections;

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> rel = new ArrayList<Integer>();
        if(k>input.length||k==0)
            return rel;
        for (int i = 0; i <input.length ; i++) {
            if(rel.size()<=k){
                rel.add(input[i]);
            }else {
                Collections.sort(rel);
                if(input[i]<rel.get(rel.size()-1)){
                   rel.set(rel.size()-1,input[i]);
                }
            }



        }
        return rel;
    }
}
