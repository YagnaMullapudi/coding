// Complete the function
// Take input for a and s
import java.util.*;

class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of test cases
        sc.nextLine(); // Clear the input buffer after reading integer

        while (t-- > 0) {
            int a = sc.nextInt(); // Taking integer input
            sc.nextLine(); // Clear the buffer before reading the next line

            String s = sc.nextLine(); // Taking string input (may have spaces)

            // Printing the results
            System.out.println(a);
            System.out.println(s);
        }
    }
}
