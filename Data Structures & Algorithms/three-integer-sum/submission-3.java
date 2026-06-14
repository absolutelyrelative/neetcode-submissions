class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //[-1, 0, 1, 2, -1, -4] -> [-4, -1, -1, 0, 1, 2]
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            // Skip the value if it has already been considered
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                List<Integer> curr = new ArrayList<>();
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0)
                    right--;
                if(sum < 0)
                    left++;
                if(sum == 0) {
                    curr.add(nums[i]);
                    curr.add(nums[left]);
                    curr.add(nums[right]);
                    if(!res.contains(curr))
                        res.add(curr);
                    left++;
                    right--;
                }
            }
        }

        return res;
    }
}
