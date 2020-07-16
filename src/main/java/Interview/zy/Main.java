package Interview.zy;

import java.util.*;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/22 19:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int k=Integer.parseInt(sc.nextLine());
        int[] pk=new int[n];
        for (int i = 0; i <n ; i++) {
            pk[i]=Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i <pk.length ; i++) {
            System.out.println(pk[i]);
        }
        int[] res=solution(pk,k,n);

        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }

    private static int[] solution(int[] pk, int k, int n) {
        System.out.println("k  "  +k);
        if(k==0)
            return pk;

        int mid= n/2;
        Stack<Integer> lArray=new Stack<>();
        Stack<Integer> rArray=new Stack();
        for (int i = 0; i <=mid ; i++) {
            lArray.add(pk[i]);
        }
        for (int i = mid+1; i <n ; i++) {
            rArray.add(pk[i]);
        }

       boolean rl =k%2==0?false:true;
        for (int i = 0; i <n ; i++) {
            if(rl&&!rArray.empty()){
                pk[i]=rArray.pop();
                rl=!rl;
            }else if(!lArray.empty()){
                pk[i]=lArray.pop();
                rl=!rl;
            }


        }


        solution( pk,  --k, n);
        return pk;
    }
}
