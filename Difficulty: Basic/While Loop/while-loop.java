import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = x; i >= 0; i--) {
            System.out.print(i);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
