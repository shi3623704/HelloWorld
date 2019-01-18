package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: 失少
 * @CreateDate: 2018/9/27 19:17
 * @Version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(2.0,3.0));
        System.out.println(zC(4,2));
        System.out.println(mJ(4,1));
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public static int zC(int chang,int kuan){
        return ((chang+kuan)*2);
    }

    public static int mJ(int chang,int kuan){
        return (chang*kuan);
    }
}
