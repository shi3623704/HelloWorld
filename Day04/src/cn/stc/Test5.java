package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: stc
 * @CreateDate: 2018/9/27 20:42
 * @Version: 1.0
 */

public class Test5 {
    public static void main(String[] args) {
        System.out.println(sToH(30.0));
    }

    public static double hToS(double h){
        return (h-32)/(9.0/5);
    }

    public static double sToH(double s){
        return s*(9.0/5)+32;
    }
}
