package zuochenyun.bitOperation;

public class SpiralOrderPrint {
    public static void sprialOrderPrint(int[][] matrix){
        int sc=0;
        int sr=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while (er>=sr&&ec>=sc){
            printEdge(matrix,sc++,sr++,ec--,er--);
        }
    }

    private static void printEdge(int[][] matrix, int sc, int sr, int ec, int er) {

//        System.out.println("sc "+sc);
//        System.out.println("sr "+sr);
//        System.out.println("ec "+ec);
//        System.out.println("er "+er);
        if(sc==ec){//只有一列
            for (int i = sr; i <=er ; i++) {
                System.out.print(matrix[i][sc]+" ");
            }

        }else if(sr==er) {//只有一行
            for (int i = sc; i <=ec ; i++) {
                System.out.print(matrix[sr][i]+" ");
            }
        }else {
            int curc=sc;
            int curr=sr;
            while (curc!=ec){
                System.out.print(matrix[sr][curc]+" ");
                curc++;
            }
            while (curr!=er){
                System.out.print(matrix[curr ][ec]+" ");
                curr++;
            }
            while (curc!=sc){
                System.out.print(matrix[er ][curc]+" ");
                curc--;
            }

            while (curr!=sr){
                System.out.print(matrix[curr ][sc]+" ");
                curr--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] s={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] s1={{1,2,3}};
        sprialOrderPrint(s);
    }
}
