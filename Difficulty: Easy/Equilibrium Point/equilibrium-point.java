class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        
        // Calculate total sum of array
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            // Right sum after removing current element
            totalSum -= arr[i];
            
            // Check equilibrium condition
            if (leftSum == totalSum) {
                return i;
            }
            
            // Update left sum
            leftSum += arr[i];
        }
        
        return -1;
    }
}
