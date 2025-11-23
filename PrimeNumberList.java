import java.util.Scanner;

public class PrimeNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to display primes: ");
        int a = sc.nextInt();
        for(int i = 2; i <= a; i++) {
            int count = 0;
            for(int j = 1; j<=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
