package Methods;

import java.util.Scanner;

public class LetterSearch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your fullname");
        String fullName = input.next();
        boolean LetterFound = false;
        for (int i =0; i < fullName.length() ; i++ )
        {
            char currentLetter = fullName.charAt(i);
            if (currentLetter =='a' || currentLetter =='A'){
                LetterFound = true;
                break;
            }

        }
        if (LetterFound){
            System.out.println("fullname contain a letter is a ");
        }
        else {
            System.out.println("fullname not contain a letter a");
        }
    }
}
