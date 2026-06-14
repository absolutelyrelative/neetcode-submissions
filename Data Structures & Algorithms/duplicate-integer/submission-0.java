class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Number, Whether it appeared
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int ctr = 0; ctr < nums.length; ctr++) {
            // Try to get whether nums[ctr] appeared
            if(map.get(nums[ctr]) != null) {
                return true;
            }
            map.put(nums[ctr], 1);
        }
        return false;
    }
}