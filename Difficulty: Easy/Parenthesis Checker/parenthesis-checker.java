import java.util.Stack;

class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Check if the top of the stack matches the closing bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}
