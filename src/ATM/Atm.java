package ATM;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        final int availamount = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.printf("available amount is " + availamount);
        System.out.println("Enter the amount to withdraw");
        int withdraw = sc.nextInt();
        if (withdraw>0 && withdraw%100==0 && withdraw<availamount){
            int bal = (availamount - withdraw);
            System.out.println("winthdrawed" + withdraw);
            System.out.println("Avaialble balance is " + bal);
        }
        else {
            System.out.printf("Invalid input error");
        }
    }
}
