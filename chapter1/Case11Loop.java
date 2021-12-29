package chapter1;

public class Case11Loop {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    //while
    public static void test1() {
    int x=1;
    while(x<4){
        System.out.println("x= "+x);
        x++;
    }
    }

    //do while
    public static void test2() {
        int x=1;
        do{
            System.out.println("x= "+x);
            x++;
        }while(x<=-9);
    }

    //for循环
    public static void test3() {
        int sum=0;
        for(int i=1;i<4;i++){
            sum=sum+i;
        }
        System.out.println("sum= "+sum);
    }

    public static void test4(){
        for(int i=1;i<=9;){
            for(int j=1;j<=i;) {
                System.out.print("*");//print()不换行
                j++;//当j+1后 j>i 跳出循环 下一次当i=2，j=1重新进入循环
            }
            System.out.println();//println()追加换行
            i++;
        }
    }
}
