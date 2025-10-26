class Solution {
    public String toLower(String s) {
        return s.toLowerCase();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        

        String test1 = "ABCddE";
        String test2 = "LMNOppQQ";
        
        System.out.println("Input: " + test1);
        System.out.println("Output: " + sol.toLower(test1));
        System.out.println("Expected: abcdde");
        
        System.out.println("\nInput: " + test2);
        System.out.println("Output: " + sol.toLower(test2));
        System.out.println("Expected: lmnoppqq");
    }
}