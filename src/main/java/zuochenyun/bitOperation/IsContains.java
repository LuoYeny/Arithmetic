package zuochenyun.bitOperation;

public class IsContains {
    public boolean isContains(int[][]arr,int k){
        int row=0;//行
        int cow=arr[0].length-1;//列

        while (row<arr.length-1&&cow>-1){
            if(k==arr[row][cow])
                return true;
            else if(k>arr[row][cow])
                row++;
            else cow--;
        }
        return false;


    }
}
