import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to calculate Nth fibonacci number:");
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
    public static int fib(int n) {
        int num1 = 0, num2 = 1, next = 0;
        for(int i=0; i<n; i++) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;
        } 
        return num1;
    }
}
