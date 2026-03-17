import java.util.*;

class Solution {
    static ArrayList<Integer> getSum(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= N; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        result.add(evenSum);
        result.add(oddSum);

        return result;
    }
}