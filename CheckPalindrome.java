import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int x = sc.nextInt();
        int x2 = x;
        int lastDigit, reversedNumber = 0;
        while(x2 > 0) {
            lastDigit = x2 % 10;
            reversedNumber = (reversedNumber*10)+lastDigit;
            x2 = x2/10;
        }
        if(x==reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
