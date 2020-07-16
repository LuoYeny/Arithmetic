package geekBang.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 16:28
 */
//括号生成
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
               if(n<=0)
                   return null;
        List<String> list= new LinkedList<>();
               solution("",n,n,list);
               return list;
    }

    private void solution(String str, int left, int right,List<String> list) {

        if(left==0&&right==0 ){
            list.add(new String(str));
            System.out.println(list);
            return;
        }
        if(left>right)  //剪枝，如果左括号剩余的大于右括号
            return;
        if(left>0){

            solution(str+"(",left-1,right,list);
        }

        if(right>0){

            solution(str+")",left,right-1,list);
        }

    }

    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(2);
    }

}
