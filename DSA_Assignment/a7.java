import java.util.*;
public class a7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s, s.length() - 1));
    }
    public static String reverse(String s, int i) {
        if (i < 0) return "";
        return s.charAt(i) + reverse(s, i - 1);
    }
}
