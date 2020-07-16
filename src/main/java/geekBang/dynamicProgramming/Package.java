package geekBang.dynamicProgramming;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/21 20:34
 */
public class Package {
    public int packageUp(int[] weight, int[] value, int n, int w){
        int[][] states= new int[n][w+1];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <w+1 ; j++) {
                states[i][j]=-1;
            }
        }
        //给第一行赋值
        states[0][0]=0;
        if(weight[0]<w)
            states[0][weight[0]]=value[0];

        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <=w ; j++) {
                if(states[i-1][j]>-1)states[i][j]=states[i-1][j];
            }
            for (int j = 0; j <=w-weight[i] ; j++) {
                if(states[i-1][j]>0){
                    int v=states[i-1][j]+value[i];
                    if(v> states[i][j+weight[i]])
                    states[i][j+weight[i]]=v;
                }
            }
        }

        // 找出最大值
         int maxvalue = -1;
        for (int j = 0; j <= w; ++j) {
            if (states[n-1][j] > maxvalue)
                maxvalue = states[n-1][j];
        }
        return maxvalue;
    }
    public static void main(String[] args) {
        int w=9;
        int[] weight={2,2,4,6,3};
        int[] value={8,2,4,6,3};
        int n=5;
        System.out.println(new Package().packageUp(weight,value,n,w));
    }
}
