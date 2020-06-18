package com.jz.ch5.t31;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {

        int max=0;
        int maxTmp=0X80000000;
        int start =0;
        for (int i = 0; i <array.length ; i++) {



            if(max<0)
                max=array[i];
            else max=max+array[i];

            if(maxTmp<max)
                maxTmp=max;

//            if(array[i]<0){
//                maxTmp=max;
//            }
//                max=max+array[i];
//                if(max<array[i]&&array[i]>=0){
//                    max=array[i];
//                    maxTmp=max;
//                    start=i;
//
//                }




        }
         return maxTmp;
    }
}
