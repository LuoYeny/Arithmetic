package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 14:51
 */
//判断两个字符串是否互为变形词
public class IsDeformation {
    public boolean isDeformation(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char[] chars1=s1.toCharArray();
        char[] chars2 =s2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i <chars1.length ; i++) {
            map[chars1[i]]++;
        }
        for (int i = 0; i <chars2.length ; i++) {
            if((map[chars2[i]]--)==0)
                return false;
        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(new IsDeformation().isDeformation("123","421"));
    }
}
