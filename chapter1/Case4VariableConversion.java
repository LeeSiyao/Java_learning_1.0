package chapter1;

public class Case4VariableConversion {
    public static void main(String[] args) {
//        auto();
//        force();
//        lossPrecision();
        autoUpper();

    }
    //自动类型转换
    public static void auto(){
        byte b=3;
        int x=b; //int存储空间比byte大
        System.out.println(x);
    }

    //强制类型转换
    public static void force() {
        int num=100000; //当数字太大，会导致发生数据精度丢失，数据空间截取
        byte b=(byte)num;
        System.out.println(b);
    }

    //精度丢失
    public static void lossPrecision(){
        int b=298;
        byte a=(byte)b;
        System.out.println("b="+b);
        System.out.println("a="+a);
    }
    //自动类型转换
    public static void autoUpper() {
        byte b1=3;
        byte b2=4;
        byte b3=(byte)(b1+b2);
    }
}
