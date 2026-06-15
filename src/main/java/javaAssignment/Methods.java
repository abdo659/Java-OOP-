package javaAssignment;

public class Methods {
    // Print Numbers Descending (10 to 1)
    public static void printNumbersDescending(int i) {


        do {
            System.out.println(i);
            i--;
        }
        while (i >= 1);
    }

//Check Even or Odd
    public static void printEvenOrOdd(int number){

        if(number>0) {
            if (number % 2 == 0) {
                System.out.println(number + "  is even");
            } else {
                System.out.println(number + "  is odd");

            }
        }
        else{
            System.out.println("not even or odd");
        }
    }

// Check Number Type (Positive/Negative/Zero)
    public static String checkNumberType(int number){

        if (number > 0 ){
           return "positive";
        }
        else if (number < 0) {
            return "negative";

        }
        else {
            return "zero";
        }



    }

//Calculate Sum of Two Numbers
    public static int calculateSum(int number1, int number2){
        int sum = number1 + number2 ;
        return sum ;
    }
 }