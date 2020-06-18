package com.jz.ch5.t29;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0)
            return 0;
        if(array.length==1)
            return array[0];
         int low=0;
         int mid= array.length/2+1;
         int high=array.length-1;
         int index=sort(low,high,array);
        System.out.println("index  :"+index);

        for (int i = 0; i <array.length ; i++) {
            System.out.print (array[i]+"  ");

        }
        System.out.println();
      //  System.out.println("index  :"+index);
         while (index==mid){
                System.out.println("index  :"+index);
             if(index<mid){
                 low=index+1;
                 index=sort(index,high,array);
             }else {
                 high=index-1;
               //  System.out.println("high  :"+high);
                index=sort(low,index,array);
             }
         }

         int result = array[mid];
        System.out.println(result);
         boolean flag=checkValue(array,result);
         if(flag) return result;
         else return 0;

    }



    private int sort(int low,int high,int[] arry){

      int tmp = arry[low];
      System.out.println("high  :"+high);
        System.out.println("low  :"+low);
      while(low<high){

          while (tmp<=arry[high]&&low< high){//右边
              high--;
          }
          arry[low]=arry[high];
          while(tmp>=arry[low]&&low< high){//左边
              low++;

          }
          arry[high]=arry[low];
      }

      arry[high]=tmp;

      //  System.out.println("high  :"+high);
      return high;
  }
    private boolean checkValue(int[] array, int result) {
        int count=0;
        int mid=array.length/2;
        for (int i = 0; i <array.length ; i++) {
            if(result==array[i])
                count++;
        }

        if(count>mid) return true;
        else  return false;
    }


    public static void main(String[] args) {
        int[] array ={1};
        MoreThanHalfNum obj = new MoreThanHalfNum();
      int rel=  obj.MoreThanHalfNum_Solution(array);
       System.out.println(rel);
    }

}
