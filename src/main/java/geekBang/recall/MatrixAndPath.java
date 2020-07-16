package geekBang.recall;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/18 17:57
 */
//矩阵中的最小路径  左上角 到右下角
public class MatrixAndPath {
   private int curMin=Integer.MAX_VALUE;
    public int matrixAndPath(int[][]matrix){
        if(matrix==null)
        return 0;
        int col=matrix[0].length-1 ;//列
        int row=matrix.length-1 ;//行

       getMinPath(matrix,col,row,0,0,0);
       return curMin;


    }

    private void getMinPath(int[][] matrix, int col, int row, int curRow, int curCol, int min) {
        min=min+matrix[curRow][curCol];


        if(curCol==col &&row==curRow ){
            curMin=Math.min(min,curMin);

            return ;
        }



        if(curCol<col){

           //     min=min+matrix[curRow][curCol];

                getMinPath(matrix,col,row,curRow,curCol+1,min);

        }

        if(curRow<row){

          //  min=min+matrix[curRow][curCol];

                getMinPath(matrix,col,row,curRow+1,curCol,min);

        }



    }


    public static void main(String[] args) {
        int[][] m={{2,2,2},{2,2,2},{2,2,1}};
        System.out.println(new MatrixAndPath().matrixAndPath(m));
    }
}
