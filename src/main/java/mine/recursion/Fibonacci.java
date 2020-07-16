package mine.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int rel = solution(n);
    }

    private static int solution(int n) {
        //递归终止条件
        if(n==1||n==2)
            return 1;

        else return solution(n-1)+solution(n-2);


    }


    public static int feibounaqi(int i) {
        if (i==1) {
            return 1;
        }
        if (i==2) {
            return 1;
        }
        int f1=1; //第一数
        int f2=1; //第二数
        int c=0;  //返回结果数

        //这个循环只要i>=3就会执行
        for (int j =3;j<=i; j++) {
            c=f1+f2;
            f1=f2;
            f2=c;
        }
        return c;
    }
}
