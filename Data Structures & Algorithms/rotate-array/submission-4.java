class Solution {
    public void rotate(int[] nums, int k) {
        int[] shiftedNums = new int[nums.length];

        for(int ctr = 0; ctr < nums.length; ctr++) {
            // 0 + 3 mod 8 = 3 shiftedNums[0] = nums[3]
            // shiftedNums[1] = nums[4]

            // shiftedNums[0] = nums[4]
            // shiftedNums[1] = nums[5]
            // shiftedNums[2] = nums[6]
            // shiftedNums[3] = nums[7]
            shiftedNums[(ctr + k)%nums.length] = nums[ctr];
        }
        for (int i = 0; i < nums.length; i++) {     
            nums[i] = shiftedNums[i];
        }
        
    }
}