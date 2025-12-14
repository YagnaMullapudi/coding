// User function Template for Java
class Solution {
    public static void square(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == 0 || i == s - 1 || j == 0 || j == s - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
