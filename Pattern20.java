public class Pattern20 {
    public static void main(String[] args) {
        int n=5, spaces=2*n-2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
        spaces=2;
        for(int i=1; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("*");
            }
            for(int k=1; k<=spaces; k++) {
                System.out.print(" ");
            }
            for(int j=n; j>i; j--) {
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
    }
}
