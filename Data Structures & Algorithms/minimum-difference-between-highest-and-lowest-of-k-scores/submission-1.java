class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        // 1, 2, 3, 3, 5, 6 -> The further you go, the further the difference
        int left = 0;
        int right = nums.length >= k ? k - 1 : 0;
        int minimum = Integer.MAX_VALUE;

        while(right < nums.length) {
            int currentMinimum = nums[right] - nums[left];
            //System.out.println();
            //System.out.print("Left: "); System.out.print(left); 
            //System.out.print(" Right: "); System.out.print(right);
            //System.out.print(" currentMinimum: "); System.out.print(currentMinimum);
            minimum = Math.min(minimum, currentMinimum);
            left++;
            right++;
        }

        return minimum;
    }
}