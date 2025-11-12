class Solution {
    public void swap(int a, int b) {
        // code here
        int temp = a;  // store value of a in temp
        a = b;         // assign b to a
        b = temp;      // assign temp (old a) to b

        System.out.println(a + " " + b);
    }
}
