class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int counter = 0;

        // [2,10,10,30,30,30]
        while(right < nums.length) {
            nums[left] = nums[right];
            while(right < nums.length && nums[left] == nums[right]) {
                right++;
            }
            counter++;
            left++;
        }

        return counter;
    }
}