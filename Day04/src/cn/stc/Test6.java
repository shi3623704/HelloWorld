package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: stc
 * @CreateDate: 2018/9/27 20:47
 * @Version: 1.0
 */

public class Test6 {
    public static void main(String[] args) {
        System.out.println(zJ(5,4,3));
    }
    public static boolean zJ(int a,int b,int c){
        int max=0;
        int min=0;
        if(a==b&&a==c&&c==b){
            System.out.println("数据有误");
        }

        max =(a>b?a:b)>c?(a>b?a:b):c;
        min =(a<b?a:b)<c?(a<b?a:b):c;
        int z=(a+b+c)-max-min;

        return max*max==min*min+z*z;
    }
}
