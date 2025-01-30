import java.util.Scanner;

public class PosorNegative {
    public static void main(String[] args) {
        System.out.println("Enter the number to check");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if (number < 0){
            System.out.println("negative number");
        }
        else {
            System.out.println("positive number");
        }
    }
}
