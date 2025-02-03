package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime or not");
        int num = sc.nextInt();
        if ( num!=0 || num<0 ) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Not a prime number");
                    break;
                } else {
                    System.out.println("It is a prime number");
                    break;
                }

            }
        }
        else {
            System.out.println("Enter a valid number");
        }
    }
}
