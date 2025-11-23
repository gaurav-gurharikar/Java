public class RecursionPrintNumbers {
    public static void main(String[] args) {
        recursionDemo(1);
    }
    public static void recursionDemo(int n) {
        if (n>5) return;
        System.out.println(n);
        recursionDemo(n+1);
    }
}
