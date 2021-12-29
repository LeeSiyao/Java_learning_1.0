package chapter1;

public class Case10Switch {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    //swich结构:星期
    public static void test1() {
        int week = 5;
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的数字不正确");
                break;

        }
    }


    public static void test2() {
        int week = 5;
        switch (week) {
            case 1: //case num: in case num=week
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是周末");
                break;
        }
    }
}
