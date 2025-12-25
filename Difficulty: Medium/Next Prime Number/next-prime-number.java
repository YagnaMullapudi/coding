class Solution {
    public static int nextPrime(int n) {
        int num = n + 1;
        
        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }
    
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;
        
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
