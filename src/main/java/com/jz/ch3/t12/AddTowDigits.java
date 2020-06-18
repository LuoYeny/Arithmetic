package com.jz.ch3.t12;

public class AddTowDigits {
    public static void solution(int [] num1,int[] num2){
        //两个都是正数
        int[] num=null;
        if(num1[0]>=0&&num2[0]>=0){

           num =add(num1,num2);
        }else if(num1[0]<=0&&num2[0]<=0){
            num1[0]=-1*num1[0];
            num2[0]=-1*num2[0];
            num=add(num1,num2);
            num[num.length-1]=-1*num[num.length-1];
        }else  num=decrease(num1,num2);

        print(num);
        for (int i = 0; i <num.length ; i++) {
            System.out.print(num[i]);
        }

    }

    private static int[] decrease(int[] num1, int[] num2) {
        int len1=num1.length;
        int len2 = num2.length;
        int [] num =new int[(len1>len2)?len1:len2];
         int symbol1=0;
        int symbol2=0;
         if(num1[0]<0){
             num1[0]=-1*num1[0];
             symbol1=1;
         }
        if(num2[0]<0){
            num2[0]=-1*num2[0];
            symbol2=1;
        }

        //先判断两个数的绝对值大小
        int compareRelsult=compare(num1,num2);
        System.out.println(compareRelsult);
        //相等
        if(compareRelsult==2)
            return  num;
        if(compareRelsult==1){
            for (int i = 0; i <len1 ; i++) {
                if(i<len2)
                num[i]=num[i]+num1[i]-num2[i];
                else num[i]=num[i]+num1[i];
                if(num[i]<0){
                    num[i]=num[i]*(-1);
                    num[i+1]=-1;
                }

            }
            if(symbol1==1){
                num[num.length-1]=-1*num[num.length-1];
            }
        }
        if(compareRelsult==0){
            for (int i = 0; i <len2 ; i++) {
                if(i<len1)
                    num[i]=num[i]+num2[i]-num1[i];
                else num[i]=num[i]+num2[i];
                if(num[i]<0){
                    num[i]=num[i]*(-1);
                    num[i+1]=-1;
                }

            }
            if(symbol1==1){
                num[num.length-1]=-1*num[num.length-1];
            }
        }

return num;

    }
    public static int compare(int[] num1, int[] num2){
        if(num1.length>num2.length)
            return  1;
        else if(num1.length<num2.length)
            return 0;

        for (int i = num1.length-1; i >0 ; i--) {
            if(num1[i]>num2[i])
                return 1;
            if(num1[i]<num2[i])
                return 0;

        }
        //相等
        return 2;
    }

    private static int[] add(int[] num1, int[] num2) {
        int len1=num1.length;
        int len2 = num2.length;

        if(len1>=len2){
            int [] num =new int[len1+1];
            int index =0;
            for (int i = 0,j=0; i <len1&&j<len2 ; i++,j++) {
                num[i]=num1[i]+num2[j]+num[i];
             //   System.out.println("num[i] :"+num[i]);
                if(num[i]>=10){

                    num[i]=num[i]-10;

                    num[i+1]=1;
                }
                index=i+1;
            }
            while (index<len1){
                num[index++]=num[index++]+num1[index++];
            }

            return num;
            }else {
            int [] num =new int[len2+1];
            int index =0;
            for (int i = 0,j=0; i <len1&&j<len2 ; i++,j++) {
                num[i]=num1[i]+num2[j]+num[i];
                if(num[i]>=10){
                    num[i]=num[i]-10;
                    num[i+1]=1;
                }
            }
            while (index<len1){
                num[index++]=num[index++]+num2[index++];
            }
            return num;
        }



    }

    private static  void print(int[] number) {
        int len = number.length-1;
        //   System.out.println("Len : "+len);
        int numLen=0;

        while(len>=0&&number[len]==0){

            len--;

        }
        numLen=len;


        for (int i = numLen; i >=0 ; i--) {
            System.out.print(number[i]);

        }
        System.out.println();

    }
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
//        System.out.print("请您输入内容:");
//        int contents=input.nextInt(); //输入整型
//        String contents1=input.next(); //输入字符串型

        //-12 33434
        int[] num1={1,2,3,4};
        int[] num2={-9,7,3,4,5};
        solution(num1,num2);
    }
}
