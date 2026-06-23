class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        if(nums.length == 1) return 0;

        while(left <= right) {
            int m = (left + right) / 2;

            if(isCorrect(nums, m) > 0) {
                left = m + 1;
            } else if (isCorrect(nums, m) < 0) {
                right = m - 1;
            } else {
                return m;
            }
        }
        
        return -1;
    }

        public static int isCorrect(int[] nums, int m) {
            if(m > 0 && m < nums.length - 1) { // Within bounds
                if(nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) {
                    return 0; // peak
                }
                if(nums[m] > nums[m - 1] && nums[m] < nums[m + 1]) {
                    return +1; // Higher on the right
                }
                if(nums[m] < nums[m - 1] && nums[m] < nums[m + 1]) {
                    return +1; // Higher on the left and the right
                }
                if(nums[m] < nums[m - 1] && nums[m] > nums[m + 1]) {
                    return -1; // Higher on the left
                }
            } else if (m == 0){ // Outside bounds
                if(nums[m] > nums[m + 1]) {
                    return 0; // peak
                }
                return +1; // Higher on the right
            } else if (m == nums.length - 1) {
                if(nums[m] > nums[m - 1]) {
                    return 0; // peak
                }
                return -1; // Higher on the left
            }
            return 0;
        }
}