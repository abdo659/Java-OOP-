package Methods;

import java.util.Scanner;

public class StudentAverageScore {
    static void main(String[] args) {
        int numberStudent= 4;
        int numberCoursees=5 ;
        double avg = 0 ;
        for (int i =1 ; i <= numberStudent ; i++ ){
            int total =0 ;
            for (int j = 1 ; j <= numberCoursees ; j++){
                Scanner sc = new Scanner(System.in);
                System.out.println( " enter score for this course " + j +  " for this student   " + i );
                double score = sc.nextDouble();
                total += score ;

            }
            System.out.println("total is " + total );
             avg = total / numberCoursees;
            System.out.println("average is " +avg);


        }
    }
}
