package ElectricityBill;

import java.util.Scanner;

public class ElectricityBillCalc {
    public static void main(String[] args) {
        double amount;
        double a = 0.50;
        double b = 0.75;
        double c = 1.20;
        double d = 1.50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units = sc.nextInt();
        int total = units / 100;
        //System.out.println(total);
        if (total < 1) {
            amount = units * a;
           // System.out.println("Amount is" + amount);
        } else {
                if (total==1){
                    double slab1= (100) * a;
                    double slab2= (units-100)*b;
                    amount = slab1+slab2;
                    System.out.println("Amount is " + amount);
                }
                else if (total==2)
                {
                    double slab1= (100) * a;
                    double slab2= (100)*b;
                    double slab3 = (units - 200)*c;
                    amount = slab1+slab2+slab3;
                    System.out.println("Amount is " + amount);
                }
                else if (total>=3)
                {
                    double slab1= (100) * a;
                    double slab2= (100)*b;
                    double slab3 = (100)*c;
                    double slab4 = (units-300)*d;
                    amount = slab1+slab2+slab3+slab4;
                    System.out.println("Amount is " + amount);

                }

            }

    }
}
