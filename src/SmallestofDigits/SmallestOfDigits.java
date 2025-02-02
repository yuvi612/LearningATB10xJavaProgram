package SmallestofDigits;

import java.util.Scanner;

public class SmallestOfDigits {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstnumber = sc.nextInt();
        System.out.println("Enter the second number");
        int secondnumber = sc.nextInt();
        int smallest = (firstnumber<secondnumber)? firstnumber : secondnumber;
        System.out.println("Smallest number is " + smallest);

    }
}
