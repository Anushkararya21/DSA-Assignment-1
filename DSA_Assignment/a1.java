import java.util.*;
public class a1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(1, n);
    }

    public static void printNumbers(int i, int n) {
        if (i > n) return;
        System.out.print(i);
        if (i < n) System.out.print(" ");
        printNumbers(i + 1, n);
    }
}
