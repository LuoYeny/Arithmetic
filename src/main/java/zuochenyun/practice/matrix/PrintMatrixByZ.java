package zuochenyun.practice.matrix;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/12 15:32
 */
public class PrintMatrixByZ {

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        solution1(arr,arr.length-1,arr[0].length-1);
    }




    public static void  solution1(int[][] matrix,int row,int col){
        int rowu=0;//up  down
        int colu=0;
        int rowd=0;
        int cold=0;
        boolean flag=true;

        while(cold<=col&&rowu<=row){
            print1(matrix,rowu,colu,rowd,cold,flag);

            rowu=colu!=col?rowu:rowu+1;
            colu=colu!=col?colu+1:colu;

            cold=rowd!=row?cold:cold+1;
            rowd=rowd!=row?rowd+1:rowd;

            flag=!flag;

        }

    }
    public static void print1(int[][]matrix,int rowu,int colu,int rowd,int cold,boolean flage){
        if(flage){
            while(colu>=0&&rowu<=matrix.length-1){
                System.out.print(matrix[rowu][colu]+" ");
                rowu++;
                colu--;
//                System.out.println("rowu "+rowu);
//                System.out.println("colu "+colu);
            }
        }else{
            while(cold<=matrix[0].length-1&&rowd>=0){
                System.out.print(matrix[rowd][cold]+" ");
                cold++;
                rowd--;
            }


        }
    }

















    public static void  solution(int[][] matrix,int row,int col){
        int tr=0;
        int tc=0;
        int dr=0;
        int dc=0;
        boolean flag = false;
        while(tr<=row){
         //  System.out.println(" tr "+tr+"  tc "+tc+"  dr "+ dr+"  dc "+dc+" ");
            print(matrix,tr,tc,dr,dc,flag);
        //    System.out.println(" tr "+tr+"  tc "+tc+"  dr "+ dr+"  dc "+dc+" ");
            flag=!flag;
            tr= tc==col?tr+1 :tr;
            tc=tc==col?tc:tc+1;

            dc= dr==row?dc+1:dc;
            dr=dr==row?dr:dr+1;

   // System.out.println();

        }
    }
    public static void  print(int[][] matrix,int tr,int tc,int dr,int dc,boolean flag){
        //System.out.println(" tr "+tr+"  tc "+tc+"  dr "+ dr+"  dc "+dc+" ");
      // System.out.println();
        if(flag){
            while( tr<=dr ){
                System.out.print(matrix[tr++][tc--]+" ");
            }
        }else{
            while(   dr>=tr ){
                System.out.print(matrix[dr--][dc++]+" ");
            }
        }

    }
}
