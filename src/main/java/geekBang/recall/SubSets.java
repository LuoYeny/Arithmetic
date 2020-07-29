package geekBang.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 19:16
 */
public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        int len=nums.length;

        List<List<Integer>> lists=new LinkedList<>();
        List<Integer> list=new LinkedList<>();

        solution2(nums,0,len,list,lists);

        System.out.println(lists);


        return lists;

    }

    private void solution(int[] nums, int ni, int len, List<Integer> list,List<List<Integer>> lists) {
        if(ni==len){

            lists.add(new LinkedList<>(list));
            return;
        }
        solution(nums,ni+1,len,list,lists);
        list.add(nums[ni]);
        solution(nums,ni+1,len,list,lists);
        list.remove(list.size()-1);//清空背包

    }
    private void solution2(int[] nums, int ni, int len, List<Integer> list,List<List<Integer>> lists) {



        lists.add(new LinkedList<>(list));
       //  System.out.println(list);
        for (int i = ni; i < len; i++) {
            list.add(nums[i]);
            solution2(nums,i+1,len,list,lists);
            list.remove(list.size()-1);
        }


    }


    public static void main(String[] args) {
        int[] num={1,2,3 };
       new SubSets().subsets(num);


    }
}
