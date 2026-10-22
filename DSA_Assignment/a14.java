import java.util.*;
public class a14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n, 0, 1);
    }
    public static void printFibonacci(int n, long a, long b) {
        if (n <= 0) return;
        System.out.print(a);
        if (n > 1) System.out.print(" ");
        printFibonacci(n - 1, b, a + b);
    }
}
