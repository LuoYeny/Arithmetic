package enterprise.zj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 17:16
 */
//转换为两数相加的问题 通过排序提高速度
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-2,0,0,2,2};
        List<List<Integer>> lists =new ThreeSum().threeSum(arr);
        System.out.println(lists);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = solution(nums,0);

         return lists;
    }

    private List<List<Integer>> solution(int[] nums, int k) {
        List<List<Integer>> lists= new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {  //三元组
            if(i==0||nums[i]!=nums[i-1]){

                int k1=k-nums[i];
                int left=i+1;
                int right=nums.length-1;

                while (left<right){


                    int sum=nums[left]+nums[right];
                    if( sum==k1){
                        if(left==i+1||nums[left]!=nums[left-1]){

                            List<Integer> list = new LinkedList<>() ;
                            list.add(nums[i]);
                            list.add(nums[left]);
                            list.add(nums[right]);

                            lists.add(list);

                        }
                        right--;
                        left++;

                    }else if(sum>k1){
                        right--;
                    }else {
                        left++;
                    }
                }

            }


        }
        return lists;
    }
}
