import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is: "+fact);
        sc.close();
    }
}
