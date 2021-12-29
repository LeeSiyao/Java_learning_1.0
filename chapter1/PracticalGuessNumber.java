package chapter1;

import java.util.Random;
import java.util.Scanner;

public class PracticalGuessNumber {
    public static void main(String[] args) {
        //生成随机数rand
        Random random=new Random();//随机生成器
        int rand=random.nextInt(10);//
        //从控制台获取输入数据
        Scanner scanner=new Scanner(System.in);
        //输入数据num
        int num;
        do{
            System.out.println("please input a number: ");
            num=scanner.nextInt();
            if(num>rand) {
                System.out.println("the input number is bigger than the guess number ><");
            }else if(num<rand){
                System.out.println("the input number is smaller than the guess number ><" +rand);
            }else{
                System.out.println("bingo^^ you're right");
            }
        }while(num!=rand);

    }
}
