import java.util.*;
public class a10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumDigits(n));
    }
    public static long sumDigits(long n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
}
