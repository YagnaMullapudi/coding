//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
