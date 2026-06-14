class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;

        HashSet<Integer> windowContents = new HashSet<Integer>();
        
        for(int j = 0; j < nums.length; j++) {
            if(j-i > k) {
                windowContents.remove(nums[i]);
                i++;
            }
            if(windowContents.contains(nums[j])) return true;
            windowContents.add(nums[j]);
        }

        return false;
    }
}