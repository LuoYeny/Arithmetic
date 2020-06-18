package zuochenyun.bitOperation;

public class PrintHalfMajor {
    public void printHalfMajor(int[]arr){
        int low=0;
        int high=arr.length-1;
        int middle=high/2;
        int index=partion(arr,low,high);
        while (index!=middle){
            if(index>middle){
                high=index-1;
                partion(arr,low,high);

            }else {
                low=index+1;
                partion(arr,low,high);
            }
        }
        int result=arr[middle];
        if(!checkMoreThanHalf(arr,result))
            System.out.println("no such number");
      else   System.out.println(result);
    }

    private boolean checkMoreThanHalf(int[] arr, int result) {
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==result)
                count++;
        }
        boolean moreThanhalf=true;
        if(count*2<=arr.length)
            moreThanhalf=false;

        return moreThanhalf;
    }

    private int partion(int[] arr,int low,int high){
        int tmp=arr[low];

        while (high>low){
            while (tmp<=arr[high]&&high>low){
                high--;
            }
            arr[low]=arr[high];
            while (tmp>=arr[low]&&low<high){
                low++;
            }
            arr[high]=arr[low];

        }
        arr[high]=tmp;
        return high;

    }
}
