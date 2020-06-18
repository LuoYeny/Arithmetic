package zuochenyun.bitOperation;

public class PrintUniquePair {
    public void printUniquePare(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while (right<left){
            if ((arr[left] + arr[right])>k) {
                right--;
                }else if((arr[left] + arr[right])<k){
                left++;
            }else {
                if(left==0||arr[left-1]!=arr[left]){
                    System.out.println(arr[left]+","+arr[right]);
                }
                right--;
                left++;
            }
            }
        }

    }

