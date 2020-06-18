package com.jz.binaryTree;

public class VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int [] sequence) {

        if(sequence.length==0)
            return false;
        boolean relsult =false;
        int begin=0;
        int end =sequence.length-1;

        relsult=solution( begin,end,sequence);
        return relsult;

    }

    private boolean solution(int begin, int end,int [] sequence) {
        if(end<begin)
            return false;
        //左子树判断
        int i = begin;
        for (; i <end ; i++) {
            if(sequence[end]<sequence[i])
                break;
        }
        //右子树
        int j = i;
        for (; j < end; j++) {
            if(sequence[end]>sequence[j])
                return false;
        }
        //左子树递归
        boolean left = true;
        if(i>0){
            left=solution(0,i-1,sequence);
        }
        boolean right =true;
        if(i<end-1){
            right=solution(i,end-1,sequence);
        }
        return right&&left;
    }

    public static void main(String[] args) {

    }
}
