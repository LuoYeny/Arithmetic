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
}
