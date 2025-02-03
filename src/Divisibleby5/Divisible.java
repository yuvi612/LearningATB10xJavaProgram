package Divisibleby5;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to validate whether it is divisible by 5 & 11");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.printf("Number is divisible by both  5 & 11");
        } else {
            System.out.println("not divisible by 5 & 11");
        }
    }
}
