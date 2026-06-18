class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int m = (left + right) / 2;

            if(nums[m] > target) {
                right = m - 1;
            } else if (nums[m] < target) {
                left = m + 1;
            } else {
                return m;
            } System.out.println(left); System.out.println(right);
        }
        

        if(right > left) return right;
        if(left > right) return left;

        return -1;
    }
}