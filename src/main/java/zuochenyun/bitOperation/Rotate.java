package zuochenyun.bitOperation;

public class Rotate {
    public static void rotate(int[][] matrix){
        int sc=0;
        int sr=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while (er>=sr&&ec>=sc){
            rotateEdge(matrix,sc++,sr++,ec--,er--);
        }
    }

    private static void rotateEdge(int[][] matrix, int sc, int sr, int ec, int er) {
        // r 行
        //c 列
        int times=ec-sc;
        int tmp=0;
        for (int i = 0; i <times ; i++) {
            tmp=matrix[sr ][sc+i];
            matrix[sr ][sc+i]=matrix[er-i][sc];
            matrix[er-i][sc]=matrix[er][ec-i];
            matrix[er][ec-i]=matrix[sr+i][ec];
            matrix[sr+i][ec]=tmp;

        }


    }

    public static void main(String[] args) {
        int[][] s={{1,2,3},{4,5,6},{7,8,9} };
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j <s[0].length ; j++) {
                System.out.print (s[i][j]+"    ");
            }
            System.out.println();
        }
        rotate(s);
        System.out.println("------");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j <s[0].length ; j++) {
                System.out.print (s[i][j]+"    ");
            }
            System.out.println();
        }

    }
}
