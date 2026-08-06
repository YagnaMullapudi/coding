class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int low = 1;
        int high = x;
        int ans = 0;
        while(low<=high){
            int middle = low + (high - low) / 2;
            long square = (long) middle * middle;
            if(square == x){
                return middle;
            }else if(square<x){
                ans = middle;
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return ans;
    }
}