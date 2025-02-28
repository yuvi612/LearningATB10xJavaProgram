package Array;

import java.util.Scanner;

public class CheckNumberPresense {
    public static void checking(int n) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println(a[i] + "is present");
                System.exit(0);
            }
            }
        System.out.println("not present");

    }


        public static void main (String[]args)
        {
                int num;
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                checking(num);



        }

    }
