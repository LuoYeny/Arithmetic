package zuochenyun.bitOperation;

public class PrintHalfMajor1 {
    public static void printHalfMajor(int[]arr){
        int count=1;
        int result=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(count==0){
                count=1;
                result=arr[i];
            }
            if(arr[i]==result){
                count++;
            }else count--;
        }
        if(!checkMoreThanHalf(arr,result))
            System.out.println("no such number");
      else   System.out.println(result);
    }
    private static boolean checkMoreThanHalf(int[] arr, int result) {
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==result)
                count++;
        }
        boolean moreThanhalf=true;
        if(count*2<=arr.length )
            moreThanhalf=false;

        return moreThanhalf;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,1,1};
        printHalfMajor(arr);
    }
}
