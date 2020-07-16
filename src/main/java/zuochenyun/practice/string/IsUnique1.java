package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 15:45
 */
//字符串中的所有字符是否都是唯一的  空间复杂度为O(n)
public class IsUnique1 {
    public boolean isUnique(String str){
        if(str==null||str.length()==0)
            return true;
        char[] chars = str.toCharArray();
        boolean[] map =new boolean[256];
        for (int i = 0; i <chars.length ; i++) {
            if(map[chars[i]])
                return false;
            map[chars[i]]=true;
        }

          return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsUnique1().isUnique("1232"));
    }
}
