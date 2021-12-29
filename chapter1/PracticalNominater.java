package chapter1;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Random;
import java.util.Scanner;

public class PracticalNominater {
    public static void addStudents(String[] students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.next();
        }
    }
    public static void allStudent(String[] students) {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void randomStudent(String[] students){
        Random random=new Random();
        int num= random.nextInt(students.length);
        System.out.println("随机点到的同学为："+students[num]);
    }

    public static void main(String[] args) {
        String[] students=new String[5];
        addStudents(students);
        System.out.println();
        allStudent(students);
        System.out.println();
        randomStudent(students);
    }

}
