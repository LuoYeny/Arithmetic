package practiceAll.permutation;

import java.util.Arrays;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 16:01
 */
//比当前数值大的新排列
public class NextPermutation {

    public static void main(String[] args) {
        int[] nums= {1,2,3,6,5,4,3,2,1};

        solution(nums);
    }

    private static void solution(int[] nums) {
        int bigIndex=nums.length-1;

        int i = nums.length-2;
        for (; i >=0 ; i--) {
            if(nums[i]>nums[bigIndex])
                bigIndex--;
            else break;
        }

        if(bigIndex==0)
            return; //已经是最大序列了

        //在后面的数中找到比倒数过去逆序数大的最小值

        int j = bigIndex;
        for (; j <nums.length ; j++) {
            if(nums[j]<=nums[i])
                break;
        }
        int swapIndex=j-1;

        swap(nums,i,swapIndex);

        //对交换后的数 i后面的数进行排序 小在前

        //sort(nums,i+1,nums.length-1);
        Arrays.sort(nums,i+1,nums.length );

        for (int k = 0; k <nums.length ; k++) {
            System.out.print(nums[k]+" ");
        }


    }

    private static void sort(int[] nums, int start, int end) {
        if(start>end)
            return;
        int inedx= quickSort(nums,start,end);
        sort(nums,start,inedx-1);
        sort(nums,inedx+1,end);
    }

    private static int quickSort(int[] nums, int left, int right) {
        int tmp=nums[left];
        while (left<right){
            while (right>left&&nums[right]>=tmp)
                right--;
            nums[left]=nums[right];

            while (left<right&&nums[left]<tmp)
                left++;
            nums[right]=nums[left];



        }
        nums[left]=tmp;
        return left;

    }

    private static void swap(int[] nums, int i, int j) {

        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
