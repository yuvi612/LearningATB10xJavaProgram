package MultiplicateTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to multiply");
        num = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            int mul = num *i;
            System.out.println(mul);
        }

    }
}
