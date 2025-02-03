package YearsMonthsDaysCalc;

import java.util.Scanner;

public class YearsMonthsDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days to calculate");
        int daysInYear = 365;
        int daysInMonth = 30;
        int days = sc.nextInt();
        // Convert days into years, months, and days
        int years = days / daysInYear;
        int remainingDaysAfterYears = days % daysInYear;
        int months = remainingDaysAfterYears / daysInMonth;
        int remainingDays = remainingDaysAfterYears % daysInMonth;

        // Print the result in the desired format
        System.out.println(years + " years, " + months + " months, and " + remainingDays + " days.");
    }
}
