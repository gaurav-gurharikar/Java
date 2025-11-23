import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++) {
            if(a%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
        sc.close();

    }
    
}
