package chapter1;

public class Case12Function {
    public static void main(String[] args) {
        printRectangle(3,5);
        printRectangle(2,4);
        printRectangle(6,10);
    }

    public static void printRectangle(int rows,int columns){
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("*");
            } System.out.println();
        }System.out.println();//在行列都循环完之后函数中换行
    }
}
