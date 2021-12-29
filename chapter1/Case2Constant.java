package chapter1;

public class Case2Constant {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
    }
    //整数
    public static void test1(){
        System.out.println(0b11100111); //2进制
        System.out.println(0723102); //8进制
        System.out.println(123490); //10进制
        System.out.println(0xa12390); //16进制
    }

    //浮点数
    public static void test2(){
        System.out.println(0f);
        System.out.println(3.6d);
        System.out.println(2e3f);
        System.out.println(5.022e+23f);
    }

    //字符 字符串 布尔
    public static void test3(){
        System.out.println('好');
        System.out.println('a');
        System.out.println("hello world");
        System.out.println(true);
        System.out.println(false);
    }
}
