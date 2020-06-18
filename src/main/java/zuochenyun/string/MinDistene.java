package zuochenyun.string;

public class MinDistene {
    public int minDistence(String[] strings,String str1,String str2){
        if(str1==null||str2==null)
            return -1;
        if(str1.equals(str2))
            return 0;
        int last1=-1;
        int last2=-1;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i <strings.length ; i++) {
            if(strings[i].equals(str1)){
                min=Math.min(min,last2==-1?min:i-last2);
                last1=i;
            }else if(strings.equals(str2)){
                min=Math.min(min,last1==-1?min:i-last1);
                last2=i;
            }

        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
