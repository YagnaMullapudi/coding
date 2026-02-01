import java.util.ArrayList;

class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        // Sum of left diagonal
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
        }

        // Find max element in 1-D array
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }

        result.add(diagonalSum);
        result.add(max);

        return result;
    }
}
