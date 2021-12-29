package chapter1;

public class Case15ArrayErgodic {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
    }
    //遍历
    public static void test1() {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //最值
    public static void test2() {
        int[] arr={4,5,6,7,9,35,64,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max= "+max);
    }
}
