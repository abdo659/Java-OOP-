import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total_hour = 8;
        double total_temp =0 ;
        int count_echo=0 ;

       boolean service_flag= false ;

        for(int i= 1 ;i<=total_hour ;i++ ){
            System.out.println("Please Enter your office temprature at that moment at cellesius");
            int temp = sc.nextInt();
            total_temp = total_temp+ temp ;
            if (temp >26){
                System.out.println("Turn AC on");

            } else if (temp >20 && temp <= 26) {

                System.out.println("Turn AC in Echo mode");

                count_echo++ ;


            }

            else {
                System.out.println("Turn AC off");

            }
            if (temp>= 30){
                service_flag = true ;

            }


        }

        double avg =total_temp / total_hour ;

        System.out.println("avg is " + avg );

        System.out.println("count_echo is  " +  count_echo);







    }
    }
