package geekBang.dynamicProgramming;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/21 17:36
 */
//weight:物品重量，n:物品个数，w:背包可承载重量
public class Package01 {
    public int package01(int[] weight,int n,int w){
        boolean[][] states=new boolean[n][w+1];
        //特殊处理第一行
        states[0][0]=true;
        if(weight[0]<w)
            states[0][weight[0]]=true;

        //转移矩阵
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <=w ; j++) {
                if( states[i-1][j]==true){
                    states[i][j]=states[i-1][j];//把上一层的状态移下来
                }

            }

            for (int j = 0; j <=w-weight[i] ; j++) {
                if( states[i][j]==true){
                    states[i][j+weight[i]]=true;//把i加入背包
                }
            }

        }

        //输出
        for (int i = w; i >=0 ; i--) {
            if(states[n-1][i]==true) return i;
        }

        return 0;

    }

    public static void main(String[] args) {
        int w=9;
        int[] weight={2,2,4,6,3};
        int n=5;
        System.out.println(new Package01().package01(weight,n,w));
    }
}
