import java.util.Objects;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        if (letter == 'a'|| letter== 'e' || letter== 'i' ||letter== 'o' ||letter== 'u'){
            System.out.println("Entered letter is vowel");
        }
        else if (letter >= 'a' && letter <= 'z') {
            System.out.println("not a vowel letter");
        }
        else {
            System.out.println("Entered letter is not a character");

        }

        }
    }
