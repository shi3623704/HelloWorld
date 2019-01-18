package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: stc
 * @CreateDate: 2018/9/27 19:56
 * @Version: 1.0
 */

public class Test3 {
    public static void main(String[] args) {
        int min = getValue(1,2,3,"大");
        System.out.println(min);
    }
    public static int getValue(int a,int b,int c,String str){
        int x=0;
        if(str == "大"){
            if(a>b){
                if(a>c){
                    x+=a;
                }else{
                    x+=c;
                }
            }else if(b>c){
                x+=b;
            }else{
                x+=c;
            }
        }else if(str == "小"){
            x +=(a<b?a:b)<c?(a<b?a:b):c;
        }
        return x;
    }

}
