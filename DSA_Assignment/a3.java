import java.util.*;
public class a3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(2, n);
    }
    public static void printEven(int i, int n) {
        if (i > n) return;
        System.out.print(i);
        if (i + 2 <= n) System.out.print(" ");
        printEven(i + 2, n);
    }
}
