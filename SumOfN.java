public class SumOfN {
    public static void main(String[] args) {
        System.out.println(printSum2(9));
    }

    // public static void printSum1(int n,int sum) {
    //     if(n<1) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=n;
    //     printSum1(n-1, sum);
    // }
    public static int printSum2(int n) {
        if(n==0) return 0;
        return n+printSum2(n-1);
    }
}