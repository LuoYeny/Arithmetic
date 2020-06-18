package Interview.meituan;


import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list =new LinkedList<String>();
       


            String s = sc.nextLine();

           String rel =solution(s);

            System.out.println(rel);



    }

    private static String solution(String s) {



            StringBuffer stringBuffer = new StringBuffer(s);

            if(stringBuffer.charAt(0)=='-'){
                stringBuffer=stringBuffer.deleteCharAt(0);
                int point1=0;
                int point2=0;
                boolean flag=false;
                for (int i = 1; i <stringBuffer.length() ; i++) {

                    if(stringBuffer.charAt(i)=='.'){
                        point1=i;
                        flag=true;
                    }


                }
                //   System.out.println(point1);
                while (point1-3>0&&flag){
                    stringBuffer.insert(point1-3,",");
                    point1=point1-3;
                }
                for (int i = 1; i <stringBuffer.length() ; i++) {

                    if (stringBuffer.charAt(i) == '.') {
                        point2 = i;
                    }
                }

                int len=stringBuffer.length();
                while (flag==false&&len-3>0){
                    stringBuffer.insert(len-3,",");
                    len=len-3;
                }
                if(point2+1==stringBuffer.length()-1)
                    stringBuffer.append(0);
                if (flag==false  ){
                    stringBuffer.append(".00");

                }
                stringBuffer.insert(0,"$");
                stringBuffer.insert(0,"(");
                stringBuffer.append(")");
            }
            else {
                int point1 = 0;
                int point2 = 0;
                boolean flag = false;
                for (int i = 1; i < stringBuffer.length(); i++) {

                    if (stringBuffer.charAt(i) == '.') {
                        point1 = i;
                        flag = true;
                    }


                }

                while (point1 - 3 > 0 && flag) {
                    stringBuffer.insert(point1 - 3, ",");
                    point1 = point1 - 3;
                }
                for (int i = 1; i < stringBuffer.length(); i++) {

                    if (stringBuffer.charAt(i) == '.') {
                        point2 = i;
                    }
                }
                if (point2 + 1 == stringBuffer.length() - 1)
                    stringBuffer.append(0);
                int len = stringBuffer.length();
                while (flag == false && len - 3 > 0) {
                    stringBuffer.insert(len - 3, ",");
                    len = len - 3;
                }
                if (flag == false) {
                    stringBuffer.append(".00");

                }
                stringBuffer.insert(0, "$");
            }
               return stringBuffer.toString();
    }
}
