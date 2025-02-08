package WhileLoop;

public class SumOfNatural {
    public static void main(String[] args) {

        int i = 1;
        int cou = 0;
        while (i <= 10) {
            cou = cou + i;
            i++;
        }
        System.out.println(cou);
    }
}
