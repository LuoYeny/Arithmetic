package zuochenyun.string;

public class IsRotation {
    public static boolean isRotation(String str1,String str2){
        if(str1==null||str2==null||str1.length()!= str2.length() )
            return false;
        String str3=str2+str2;

        return str3.contains(str1);
    }

    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        System.out.println(isRotation(s1,s2));
    }
}
