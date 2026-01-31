class Solution {
    public static void divisor(int n) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                first.append(i).append(" ");
                
                if (i != n / i) {
                    second.insert(0, (n / i) + " ");
                }
            }
        }

        System.out.print(first.toString() + second.toString());
    }
}
