package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 15:21
 */
//给一个含有null的字符串递增数组，再给一个字符串str，返回字符所在的位置
public class GetIndex {
    public int getIndex(String[] strs,String str){
        if(strs==null||strs.length==-1||str==null)
            return -11;
        int res=-12;
        int left=0;
        int right=strs.length-1;
        int i=0;
        int mid=0;
        while (left<=right){
             mid=(left+right)/2;
            if(strs[mid]!=null&&str.equals(strs[mid])){
                res=mid;
                right=mid-1;
            }else if(strs[mid]!=null){
                if(strs[mid].compareTo(str)<0){
                    left=mid+1;
                }else  right=mid-1;
            }else {
                 i=mid;
                 while (strs[i]==null&&--i>=left);
                 if(i<left||strs[i].compareTo(str)<0){
                     left=mid+1;
                 }else {
                     res=str.equals(strs[i])?i:res;
                     right=i-1;
                 }

            }
        }
        return res;

    }

    public static void main(String[] args) {
        String[] strings ={null,"a","b",null,"rr","rr","rr","xx",null};
        System.out.println(new GetIndex().getIndex(strings,"rr"));

    }
}
