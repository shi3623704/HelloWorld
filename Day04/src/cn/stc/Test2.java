package cn.stc;

/**
 * @Description: java类作用描述
 * @Author: stc
 * @CreateDate: 2018/9/27 19:25
 * @Version: 1.0
 */

public class Test2 {
    public static void main(String[] args) {
        char a = getChar(66);
        System.out.println(a);
        String str = getString(66);
        System.out.println(str);
        String str1=getColors("red");
        System.out.println(str1);
    }

    public static char getChar(int a){
        return (char)a;
    }

    public static String getString  (int a){
        char c =(char)a;
        String str="";
        for (int i = 0; i < 4; i++) {
            str+=c;
        }
        return str;
    }

    public static String getColors(String str){
        String color="";
        switch (str){
            case "red":
                String str1=str+"是红色";
                color+= str1;
                break;
            case "blue":
                String str2=str+"是蓝色";
                color+= str2;
                break;
            case "black":
                String str3=str+"是黑色";
                color+= str3;
                break;
        }
        return color;
    }
}
