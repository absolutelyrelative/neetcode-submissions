class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int m = (left + right) / 2;

            if (isCorrect(nums, m) > 0) {
                right = m - 1;
            } else if (isCorrect(nums, m) < 0) {
                left = m + 1;
            } else {
                return nums[m];
            }
        }

        return -1;
    }

    public static int isCorrect(int[] nums, int m) {
        if((m > 0 && m < nums.length - 1) && 
            nums[m+1] != nums[m] && nums[m-1] != nums[m]) return 0;
        if((m > 0 && m < nums.length - 1) &&
            nums[m-1] == nums[m] && m % 2 == 1) return -1;
        if((m > 0 && m < nums.length - 1) &&
            nums[m+1] == nums[m] && m % 2 == 1) return +1;
        if((m > 0 && m < nums.length - 1) &&
            nums[m-1] == nums[m] && m % 2 == 0) return +1;
        if((m > 0 && m < nums.length - 1) &&
            nums[m+1] == nums[m] && m % 2 == 0) return -1;
        return 0;
    }
}