class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int[] prefixSums = new int[nums.length];
        int left = 0;
        int right = 1;
        int freq = 1;

        // Calculate prefix sum
        prefixSums[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i];
        }

        while(right < nums.length) {
            long sumChanged = nums[right] * (right - left + 1);
            int sum = prefixSums[right]; // calculate prefix sum
            if(left > 0) sum = sum - prefixSums[left - 1];

            long cost = sumChanged - sum;
            if(cost <= k) {
                freq = Math.max(freq, right - left + 1);
            } else {
                // I have to remove the prefixSum of left here
                left++;
            }
            right++;
        }

        return freq;
    }
}