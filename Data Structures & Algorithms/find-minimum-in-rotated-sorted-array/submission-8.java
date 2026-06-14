class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int minimum = nums[l];

        // 0  1. 2. 3. 4. 5. 6

        // 4, 5, 6, 7, 0, 1, 2
        while (l <= r) {
            if(nums[l] < nums[r]) {
                minimum = Math.min(minimum, nums[l]);
                break;
            }

            int m = (l + r) / 2;

            minimum = Math.min(minimum, nums[m]);
            if(nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return minimum;
    }
}
