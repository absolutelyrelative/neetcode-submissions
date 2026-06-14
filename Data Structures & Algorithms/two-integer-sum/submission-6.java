class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map with key = number, value = place where it appears
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = {0, 0};

        for(int ctr = 0; ctr < nums.length; ctr++) {
            map.put(nums[ctr], ctr);
            // number -> index
        }

        for(int ctr = 0; ctr < nums.length; ctr++) {
            // Try to get target - first element from the hash
            // if it fails, try to get target - second element etc
            // I want to check that the element of the map does not coincide
            // with the element of the array i am currently considering
            // the element of the array is i
            // the element of the map is given by key -> index
            if(map.containsKey(target - nums[ctr]) 
                && map.get(target - nums[ctr]) != ctr)
            {
                // nums 0 1 2 3
                //      1 3 4 2
                //_____________
                // map  1 3 4 2
                //      0 1 2 3
                solution[0] = ctr;
                solution[1] = map.get(target - nums[ctr]);

                Arrays.sort(solution);
                return solution;
            }
        }

       return new int[]{0, 0};
    }
}
