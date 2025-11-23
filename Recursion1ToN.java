public class Recursion1ToN {
    public static void print1ToN(int i,int n) {
        if(i<1) return;
        print1ToN(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        print1ToN(n,n);
    }
}
