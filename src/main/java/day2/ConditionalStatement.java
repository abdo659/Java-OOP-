package day2;
import java.util.Scanner;

public class ConditionalStatement {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is "+ age);

        String status = age >=18 ?"good to vote":"not good to vote";
        System.out.println("status is "+status);

        System.out.println("Enter a number to decide the output is even or odd");
        int num = sc.nextInt();
        if (num>= 0) {

         if (num == 0) {
                System.out.println("Number is zero");
            }
            else if(num %2 ==0){
                System.out.println("Number is even");

            }
             else {
                System.out.println("number is odd");
        }

    }
}
};
