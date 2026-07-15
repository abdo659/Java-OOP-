package Methods;

import java.util.Scanner;

public class Rectangle {
    Scanner input = new Scanner(System.in);
    private double width ;
    private double length ;
    public void calculateArea(){


        System.out.println("Enter width  ");
        width = input.nextInt();
        System.out.println("Enter width  ");
        length = input.nextInt();

        double Area= width*length;

        System.out.println(Area);

    }

}
