package com.jz.ch2.t4;

public class Replace {
    public static char[] replaceSpace(char[] str  ){
        if(str==null||str.length==0)
            return null;
      //判断空格个数
          int  spaceNumber =0;
          int originalLength=str.length;
        for (int i = 0; i <originalLength ; i++) {
            if(str[i]==' '){
                spaceNumber++;
            }
        }
        //得出新的长度
        int newLength=originalLength+spaceNumber*2;
        if(newLength<originalLength)
            return null;
        System.out.println("originalLength  "+originalLength);
        System.out.println("spaceNumber  "+spaceNumber);
        //替换空格
        char[] str1=new char[newLength];
         int newIndexOf = newLength-1;
        for (int i = originalLength-1; i >=0 ; i--) {
            if(str[i]==' '){
                str1[newIndexOf--]='0';
                str1[newIndexOf--]='2';
                str1[newIndexOf--]='%';

            }else str1[newIndexOf--]=str[i];

        }

        return str1;
    }

    public static void main(String[] args) {
        char[] str = {' ',' ','1','3',' ','4',' '};
        System.out.println(replaceSpace(str));
    }
}
