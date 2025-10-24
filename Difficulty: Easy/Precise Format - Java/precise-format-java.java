import java.util.*;

class Solution {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> resultList = new ArrayList<>();
        float exactResult = a / b;
        float formattedResult = Float.parseFloat(String.format("%.3f", exactResult));
        resultList.add(exactResult);
        resultList.add(formattedResult);

        return resultList;
    }
    public static void main(String[] args) {
        float a = 5.43f;
        float b = 2.653f;

        ArrayList<Float> ans = divisionWithPrecision(a, b);
        System.out.println(ans);
    }
}
