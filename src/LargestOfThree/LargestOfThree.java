package LargestOfThree;

import java.util.Scanner;

public class LargestOfThree {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is the greatest number");
        }
        else if (b>a && b >c){
            System.out.println("b is the greatest number");
        }
        else {
            System.out.println("c is the greatest number");
        }

    }
}
