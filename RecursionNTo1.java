public class RecursionNTo1 {
    public static void printNTo1(int i, int n) {
        if(i>n) return;
        printNTo1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        printNTo1(1, n);
    }
}
