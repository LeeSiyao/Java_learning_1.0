package chapter1;

public class Case6ArithmeticOperator {
    public static void main(String[] args) {
//        autoOperator();
//        div();
//        mod();
    }

    public static void autoOperator() {
        int a=1;
        int b=2;
        int x=a+b++;
//        int x=a+(++b);
//        int x=a+(b++);
        System.out.println("b=" +b);
        System.out.println("x=" +x);
    }

    public static void div() {
//        int result=2510/1000;
        double result=2.5/10;
        System.out.println("result is " +result);
    }

    public static void mod() {
        System.out.println(5%3);
        System.out.println(-5%3);
        System.out.println(5%-3);

    }
}