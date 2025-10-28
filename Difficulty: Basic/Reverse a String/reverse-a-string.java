class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder reversed = new StringBuilder();
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
        
    }
}