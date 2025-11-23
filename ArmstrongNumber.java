import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int n = sc.nextInt();
        int original = n, temp = n, sum = 0, digits = 0, lastDigit;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        while (n > 0) {
            lastDigit = n%10;
            n = n/10;
            sum = (int) (sum+Math.pow(lastDigit, digits));
        }
        if (original == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
        sc.close();
    }
}
