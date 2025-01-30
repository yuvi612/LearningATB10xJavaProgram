import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<num;i++) {
            if (num%i==0)
            {
                System.out.println("not a prime number");
                return;
            }
            System.out.println("it is a prime number");
            break;
        }

        }
    }
