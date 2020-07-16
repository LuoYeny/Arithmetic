package geekBang.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 10:15
 */
//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        if(k>n)
            return null;
        int[] nums= new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=i+1;
        }
        List<List<Integer>> lists= new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        solution2 (nums,n,k,0,lists,list);
        System.out.println(lists);

        return lists;

    }

    private void solution(int[] nums, int n, int k,int strat,List<List<Integer>> lists, List<Integer> list) {
        if(list.size()==k){
            lists.add(new LinkedList<>(list));
            // System.out.println(lists);

            return;
        }

        for (int i = strat; i <n ; i++) {
            list.add(nums[i]);
            // System.out.println(list.size());
            // System.out.println(list );
            solution(nums,n,k,i+1,lists,list);
            list.remove(list.size()-1);
        }


    }
    private void solution2(int[] nums, int n, int k,int strat,List<List<Integer>> lists, List<Integer> list) {
        if(list.size()==k){
            lists.add(new LinkedList<>(list));
            // System.out.println(lists);

            return;
        }

            solution(nums,n,k,strat+1,lists,list);
            list.add(nums[strat]);
            solution(nums,n,k,strat+1,lists,list);
            list.remove(list.size()-1);

    }

    public static void main(String[] args) {
        new Combine().combine(4,2);

    }
}
