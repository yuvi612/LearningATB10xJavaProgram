package Domain;

import java.util.Scanner;

public class DomainCheck {
    /*Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String url;
        url =sc.next();
        if (url.endsWith(".com"))
        {
            System.out.printf("The website type is: Commercial website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");

        }
    }
}
