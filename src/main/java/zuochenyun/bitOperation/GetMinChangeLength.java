package zuochenyun.bitOperation;

public class GetMinChangeLength {
    public int getMinChangeLength(int[] arr){
        int noMinLength=-1;
        int min=arr[arr.length-1];


        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>min){
                noMinLength=i;
            }else {
                min=Math.min(min,arr[i]);
            }

        }
        if(noMinLength==-1)
            return 0;
        int noMaxLength=-1;
        int max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<max){
                noMaxLength=i;
            }else {
                max=Math.max(arr[i],max);
            }
        }

        return noMaxLength-noMinLength+1;

    }
}
