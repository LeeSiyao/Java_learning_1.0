package chapter1;

public class Case9SelectionStructure {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
    }
    //if
    public static void test1() {
        int x=5;
        if(x<10){
            x++;
        }
        System.out.println(" x= "+x);
    }

    //if else
    public static void test2() {
        int num=19;
        if(num%2==0){
            System.out.println("num是偶数");
        }else{
            System.out.println("num是奇数");
        }
    }

    //三元表达式（1）
    public static void test3() {
        int x=0;
        int y=1;
        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println(max);


    }
    //三元表达式（2）
    public static void test4() {
        int x=0;
        int y=1;
        int max=x>y ? x:y;  // boolean a = 20 < 45 ? true : false;

    }

    //if else if else
    public static void test5() {
        int grade=75;
        if(grade>80){
            System.out.println("该成绩等级为优");
        }else if(grade>70){
            System.out.println("该成绩等级为良");
        }else if(grade>60){
            System.out.println("该成绩等级为中");
        }else{
            System.out.println("该成绩等级为差");
        }
    }
}
