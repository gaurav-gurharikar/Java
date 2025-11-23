import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int rev = 0, ld;
        while (x != 0) {
            ld = x%10;
            rev = (rev*10)+ld;
            x=x/10;
        }
        System.out.println("Reversed: "+rev);
        sc.close();
    }
}
