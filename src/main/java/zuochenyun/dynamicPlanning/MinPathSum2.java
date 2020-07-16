package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 16:05
 */
//最小路径和--回溯
public class MinPathSum2 {
    public int minPathSum(int[][] array){
        if(array==null)
            return 0;
        int res = solution(array,0,array.length-1,0,array[0].length-1,Integer.MAX_VALUE,0);

        return res;
    }

    private int solution(int[][] array, int row, int rowLen, int col, int colLen, int minSum,int curSum) {
        curSum=curSum+array[row][col];

        if(row==rowLen&&col==colLen){
            minSum=Math.min(curSum,minSum);
            return minSum;
        }


        if(col<colLen){
            minSum=  solution(array,row,rowLen,col+1,colLen,minSum,curSum);
        }
        if(row<rowLen){
            minSum=  solution(array,row+1,rowLen,col,colLen,minSum,curSum);
        }

        return minSum;
    }
}
