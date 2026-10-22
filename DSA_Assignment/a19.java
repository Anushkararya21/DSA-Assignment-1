import java.util.*;
public class a19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(countOccurrences(s, c, 0));
    }
    public static int countOccurrences(String s, char c, int i) {
        if (i == s.length()) return 0;
        int count = s.charAt(i) == c ? 1 : 0;
        return count + countOccurrences(s, c, i + 1);
    }
}
