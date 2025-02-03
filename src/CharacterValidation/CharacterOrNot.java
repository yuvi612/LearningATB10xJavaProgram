package CharacterValidation;

import java.util.Scanner;

public class CharacterOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char alpa = sc.next().charAt(0);
         if(alpa >='a'&& alpa <='z' ){
             System.out.println("It is a alphabet");
         }
         else {
             System.out.println("it is not a alphabet");
         }
        sc.close();
    }
}
