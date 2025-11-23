public class RecursionFactorial {
    static int fact = 1;
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
    // public static void printFactorial(int n) {
    //     if (n==0) {
    //         System.out.println(fact);
    //         return;
    //     }
    //     fact *= n;
    //     printFactorial(n-1);
    // }
    public static int printFactorial(int n) {
        if (n==0) return 1;
        return n*printFactorial(n-1);
    }
}
