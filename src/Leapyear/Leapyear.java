package Leapyear;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year to check");
        year = sc.nextInt();
        if(year % 4 ==0 && year % 100!=0){
            System.out.println("It is a leap year" + year);
        }
        else if(year%400==0){
            System.out.println("It is a leap year" + year);
        }
        else {
            System.out.println("Not a leap year" + year);
        }
    }
}
