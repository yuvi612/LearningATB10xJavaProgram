package LoanEligibilty;

import java.util.Scanner;

/*public class LoanEligibilty {
    public static void main(String[] args) {
        int age;
        double salary;
        int cscore;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
        System.out.println("Enter the credit score");
        cscore = sc.nextInt();
        if(age >=0 && age >18 && age <80 && salary>=0 && salary>=30000 && cscore>=0 && cscore>650 && cscore<=850){

            System.out.printf("Eligible for loan");
        }
        else {
            System.out.printf("not eligible for loan");
        }
    }
}*/
import java.util.Scanner;

public class LoanEligibilty {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input Age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Validate age
        if (age <= 0) {
            System.out.println("Age must be a positive number.");
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to apply for a loan.");
        } else if (age > 80) {
            System.out.println("The maximum eligible age for a loan is 80.");
        } else {
            // Input Salary
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            // Validate salary
            if (salary <= 0) {
                System.out.println("Salary must be a positive number.");
            } else if (salary < 30000) {
                System.out.println("You need to have a minimum salary of 30,000 to apply for a loan.");
            } else {
                // Input Credit Score
                System.out.print("Enter credit score: ");
                int creditScore = scanner.nextInt();

                // Validate credit score
                if (creditScore <= 0) {
                    System.out.println("Credit score must be a positive integer.");
                } else if (creditScore < 650) {
                    System.out.println("Your credit score must be at least 650.");
                } else if (creditScore > 850) {
                    System.out.println("Your credit score cannot exceed 850.");
                } else {
                    // If all validations pass, eligible for a loan
                    System.out.println("You are eligible for a loan!");
                }
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
