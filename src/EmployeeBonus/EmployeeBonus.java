package EmployeeBonus;

import java.util.Scanner;

public class EmployeeBonus {
    /*Calculate Bonus Based on Salary and Years of Experience.
    :- take the salary and Year info from the User.
    Implement Bonus Calculation Logic:
    Define the bonus structure based on salary and years of experience.
    :- If years of experience is less than 1 year: No bonus.
    :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
    :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
    :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;
        int YearOfExp;
        int bonus;
        System.out.println("Enter the salary");
        salary = sc.nextInt();
        System.out.println("Enter the year of experience");
        YearOfExp = sc.nextInt();
        if (YearOfExp < 1) {
            System.out.println("Employee not entiled for bonus");
        } else if (YearOfExp > 1 && YearOfExp < 3) {
            bonus = salary * 5 / 100;
            System.out.println("Bonus is" + bonus);

        } else if (YearOfExp > 4 && YearOfExp < 6) {
            bonus = salary * 10 / 100;
            System.out.println("Bonus is" + bonus);
        } else if (YearOfExp >= 6) {
            bonus = salary * 15 / 100;
            System.out.println("Bonus is" + bonus);
        }
    }
}
