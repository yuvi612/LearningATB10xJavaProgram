package Array;

public class AddNumbersInArray {



    public static void main(String[] args) {
        int a [] = {1,2};
        int count = 0;
        for (int i = 0 ; i<a.length; i++)
        {
            count = count + a[i];
        }
        System.out.println(count);
    }
}
