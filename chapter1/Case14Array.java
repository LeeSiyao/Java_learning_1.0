package chapter1;

public class Case14Array {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[3];
        //arr[0]=1;
        //arr[1]=2; 元素赋值
        //静态初始化
        //int[] arr=new int{1,2,3}; 一次性赋值
        System.out.println("arr[0]: "+arr[0]);//未赋值默认为0
        System.out.println("arr[1]: "+arr[1]);
        System.out.println("arr[2]: "+arr[2]);
        System.out.println("数组的长度是"+arr.length);
    }
}
