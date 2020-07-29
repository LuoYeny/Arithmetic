package geekBang.recall;




import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 17:00
 */
//含重复字符串的排列组合
public class Permutation1 {
    public void permutation(String S) {
        char[] chars = S.toCharArray();
        Arrays.sort(chars);//排序，为了去重
        boolean[] used=new boolean[chars.length];
        List<String> list = new LinkedList<>();
        solution(chars, 0, chars.length, list,new StringBuffer(),used);
        System.out.println(list);


    }

    private void solution(char[] chars, int start, int length, List<String> list,StringBuffer tmp,boolean[] used) {
        if(start==length){
            list.add(tmp.toString() );
          //  System.out.println(list);

            return;
        }


        for (int i = 0; i <length ; i++) {
            if(!used[i]){
                if(i>0&&chars[i]==chars[i-1]&&used[i-1])
                    continue;
                tmp.append(chars[i]);
                used[i]=true;
                solution(chars,start+1,length,list,tmp,used);
                tmp.deleteCharAt(start);
                used[i]=false;
            }



        }




    }




    public static void main(String[] args) {
        new Permutation1().permutation("533");
    }
}

