package Eligible_to_vote;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.println("Enter the age to check eligibility");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
