class Solution {
    public static void triangle(int s) {
        for (int i = 1; i <= s; i++) {
            if (i == s) {
                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
            } 
            else if (i == 1) {
                System.out.print("*");
            } 
            else {
                System.out.print("* "); 
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
