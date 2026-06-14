class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int r = 0;
        int averageCount = 0;
        double sum = 0;

        //Arrays.sort(arr);

        // k - 1 = 2
        while(r < arr.length) {
            sum = sum + arr[r];
            if(r - l < k - 1) {
                r++;
                continue;
            }
            double average = sum/k;
            if(average >= threshold){
                averageCount++;
            }
        
            // Move the fixed-size window & update the count after moving the window
            sum = sum - arr[l];
            l++;
            r++;
        }

        return averageCount;
        
    }
}