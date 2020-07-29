package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 17:59
 */
//在str1中包含str2的字符的最小长度
public class MInLength {
    public int match(String str1,String str2){
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        int[] map=new int[256];
        for (int i = 0; i <chars2.length ; i++) {
            map[chars2[i]]++;
        }
        int matched=chars2.length-1;
        int len= Integer.MAX_VALUE;
        int right=0;
        int left=0;
        while (right <chars1.length) {
           map[chars1[right]]--;
           if(map[chars1[right]]>=0)  //等于0为刚刚好匹配上
               matched--;

           if(matched==0){
               while ( map[chars1[left ]]<0)
                   map[chars1[left++]]++;

               len=Math.min(len,right-left+1);
                matched++;
               map[chars1[left++]]++;

           }

            right++;

        }

        return len==Integer.MAX_VALUE?0:len;

    }
}
