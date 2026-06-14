class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int minimum = nums[l];

        // 2, 1
        // L, R
        // M
        while (l <= r) {
            int m = (l + r) / 2;

            if(nums[m] > minimum) {
                l = m + 1;
            }
            if(nums[m] <= minimum) {
                minimum = nums[m];
            }
            if(nums[r] >= minimum) {
                r--;
            } else {
                minimum = nums[r];
                r--;
            }

        }

        return minimum;
    }
}
