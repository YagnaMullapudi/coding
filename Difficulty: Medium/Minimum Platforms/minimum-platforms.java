class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platformsNeeded=0;
        int maxPlatforms=0;
        int i=0,j=0;
        while(i<n & j<n){
            if(arr[i]<=dep[j]){
                platformsNeeded++;
                maxPlatforms=Math.max(maxPlatforms,platformsNeeded);
                i++;
            }else{
                platformsNeeded--;
                j++;
            }
        }
        return maxPlatforms;
        
    }
}
