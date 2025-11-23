public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {
            //char ch = 'A';
            // for(int j=1; j<=i; j++) {
            //     System.out.print(ch);
            //     ch++;
            // }
            for(char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
