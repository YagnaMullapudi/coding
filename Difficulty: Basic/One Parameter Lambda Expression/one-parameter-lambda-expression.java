/*
The interface looks like

interface Multiply {
    public int multiplyBy5(int n);
}
*/

class Solution {

    public static Multiply helperFunction() {
        // Your code here
       return (n) -> n*5;
    }

}