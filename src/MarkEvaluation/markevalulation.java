package MarkEvaluation;

import java.util.Scanner;

public class markevalulation {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark to see the grade");
        int grade = sc.nextInt();
        if(grade >=0 && grade <=100){
            if (grade > 90)
            {
                System.out.println("A+");
            }
            else if (grade >=80 && grade <=89)
            {
                System.out.println("A");
            }
            else if (grade >=70 && grade <=79)
            {
                System.out.println("B");
            }
            else if (grade >=60 && grade <=69)
            {
                System.out.println("C");
            }
            else if (grade >=50 && grade <=59)
            {
                System.out.println("D");
            }
            else if (grade >=40 && grade <=49)
            {
                System.out.println("E");
            }
            else {
                System.out.println("FAIL");
            }

        }
        else {
            System.out.println("Invalid mark, Enter the correct mark to evaluate");
        }
    }
}
