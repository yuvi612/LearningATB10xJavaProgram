package Palindrome;

import java.util.Scanner;

public class Palindrome {
   public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        int i=0,j=word.length()-1;
        while (i<j)
        {
            if(word.charAt(i)!= word.charAt(j))
            {
                System.out.println("Not a palindrome");
                System.exit(0);
            }
            i++;
           j--;

        }
        System.out.println("It is a palindrome number");
    }

}

