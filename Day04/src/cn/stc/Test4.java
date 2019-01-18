package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: stc
 * @CreateDate: 2018/9/27 20:34
 * @Version: 1.0
 */

public class Test4 {
    public static void main(String[] args) {
        System.out.println(round(10.5));
        System.out.println(round(10.4));
        System.out.println(round(10.3));
    }
    public static int round(double b){
        int x = (int)(b+0.5);
        return x;
    }
}

