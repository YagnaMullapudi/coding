class Solution {
    public static void triangleWall(int s) {

        for (int i = 1; i <= s; i++) {        // rows
            for (int j = 1; j <= i; j++) {    // columns
                System.out.print("* ");
            }
            System.out.println();             // move to next line
        }

    }
}