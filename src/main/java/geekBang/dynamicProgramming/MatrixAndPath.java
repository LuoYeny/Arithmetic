package geekBang.dynamicProgramming;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/19 16:40
 */
public class MatrixAndPath {
    public int matrixAndPath(int[][] matrix){
        int[][] dpMatrix = new int[matrix.length][matrix[0].length];
        int sum=0;
        for (int i = 0; i <matrix.length ; i++) {
            sum+=matrix[i][0];
            dpMatrix[i][0]=sum;
            
        }
        sum=0;
        for (int i = 0; i <matrix[0].length ; i++) {
            sum+= matrix[0][i];
            dpMatrix[0][i]=sum;

        }

            for (int i=1; i < matrix.length; i++) {//把行放入矩阵
                for (int j = 1; j < matrix[0].length; j++) {
                    dpMatrix[i][j]=Math.min(dpMatrix[i-1][j] ,dpMatrix[i][j-1])+matrix[i][j];
                }

            }
            return dpMatrix[matrix.length-1][matrix[0].length-1];


    }

    public static void main(String[] args) {
        int[][] m={{2,2,2},{2,2,2},{2,2,1}};
        System.out.println(new MatrixAndPath().matrixAndPath(m));
    }
}
