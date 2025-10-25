import java.util.*;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        double area = 0;

        switch (choice) {
            case 1:
                area = Math.PI * arr.get(0) * arr.get(0);
                break;

            case 2:
                area = arr.get(0) * arr.get(1);
                break;
        }
        return area;
    }

    public static void main(String[] args) {
        List<Double> circle = Arrays.asList(5.0);
        List<Double> rectangle = Arrays.asList(4.0, 5.0);

        System.out.println(switchCase(1, circle));    
        System.out.println(switchCase(2, rectangle));  
    }
}
