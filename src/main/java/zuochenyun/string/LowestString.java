package zuochenyun.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LowestString implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return (s1+s2).compareTo(s1+s2);
    }
    public String lowest(String[] strings){
        if(strings==null||strings.length==0)
            return "";

        Arrays.sort(strings, new LowestString());
        StringBuffer res =new StringBuffer();
        for (int i = 0; i <strings.length ; i++) {
            res.append(strings[i]);
        }
        return res.toString();
    }
}
