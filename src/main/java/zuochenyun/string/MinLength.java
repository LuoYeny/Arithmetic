package zuochenyun.string;

public class MinLength {
    public static  int minLength(String s1,String s2){
        if(s1==null||s2==null||s1.length()<s2.length())
            return -1;
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i <chars2.length ; i++) {
            map[chars2[i]]++;
        }
        int right=0;
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int match=chars2.length;
        while (right<chars1.length){
            map[chars1[right]]--;
            if( map[chars1[right]]>=0){
                match--;
            }
            if(match==0){
                while (map[chars1[left]]<0){  //说明后面还有chars1[left]
                    map[chars1[left++]]++;
                }

                minLength=Math.min(minLength,right-left+1);
                map[chars1[left++]]++;
                match++;
            }
            right++;
        }
        return minLength;
    }

    public static void main(String[] args) {
        String s1="1237835422323352093749";
        String s2="330";
        System.out.println(minLength(s1,s2));
    }
}
