class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        // Number - Hit count
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }

        while(k > 0) {
            int maxValue = Integer.MIN_VALUE;
            Integer maxKey = Integer.MIN_VALUE;

            for(Integer key : countMap.keySet()) {
                if(countMap.get(key) > maxValue) {
                    maxValue = countMap.get(key);
                    maxKey = key;
                }
            }

            if(maxKey != Integer.MIN_VALUE) {
                resultList.add(maxKey);
                countMap.remove(maxKey);
            }
            k--;
        }

        int[] result = new int[resultList.size()];
        for(int ctr = 0; ctr < resultList.size(); ctr++) {
            result[ctr] = resultList.get(ctr);
        }

        return result;
    }
}
