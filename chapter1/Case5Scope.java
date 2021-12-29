package chapter1;

public class Case5Scope {
    public static void main(String[] args) {
        int x=12;
        {
            int y=96;
            System.out.println("x is"+x);
            System.out.println("y is"+y);
        }
//        int z=y; 无法赋值因为y变量作用域在括号里
        System.out.println("x is"+x);
    }
}
