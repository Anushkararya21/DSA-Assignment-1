import java.util.*;
public class a17 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            printBinary(n);
        }
    }
    public static void printBinary(int n) {
        if (n == 0) return;
        printBinary(n / 2);
        System.out.print(n % 2);
    }
}
