package com.jz.ch3.t11;

public class Power {

    public static double power(double base, int exponent) throws Exception {
        double result=0.0;
        if(base==0&&exponent<0)
            throw  new Exception("分母不能为0");
        if(exponent<0)
            result =powerWithUnsignedExponent(base,-1*exponent);
        else result =powerWithUnsignedExponent(base,exponent);

        if(exponent<0) result=1/result;

        return result;
    }


    public static  double powerWithUnsignedExponent(double base, int exponent){
        System.out.println("进入函数");
        if(exponent==1)
        {
            System.out.println("进入循环");
            return base;
        }

        if(exponent==0)
            return 1;
        double result=powerWithUnsignedExponent(base,exponent>>1);
         result*=result;

        if((exponent& 0x1)==1){
             result =result*base;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(power(4,-7));
    }
}
