package zuochenyun.string;

public class GetIndex {
    public int getIndex(String[] strings,String str){
        if(str==null||strings==null||strings.length==0)
            return -1;
        int res=0;
        int left=0;
        int mid=0;
        int right=strings.length-1;
        int i=0;
        while (left<right){
            mid=(right+left)/2;
            if(strings[mid]!=null&&strings[mid].equals(str)){
                left=mid-1;
                res=mid;
            }else if(strings[mid]!=null){
                if(strings[mid].compareTo(str)>0){
                    left=mid-1;
                }else right=mid+1;
            }else {
                i=mid;
                while (strings[i]==null&&--i>=left);
                if(i<left||strings[i].compareTo(str)<0){
                    left=mid+1;
                }else {
                    res=strings[i].equals(str)?i:res;
                    right=i-1;
                }


            }
        }
        return res;
    }
}
