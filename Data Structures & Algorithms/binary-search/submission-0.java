class Solution {

    public int isCorrect(int num, int target) {
        if(num > target)
            return 1;
        if(num < target)
            return -1;
        return 0;
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if( isCorrect(nums[mid], target) > 0 ) // Number is larger than midpoint
                right = mid - 1;
            if( isCorrect(nums[mid], target) < 0 ) // Number is smaller than midpoint
                left = mid + 1;
            if( isCorrect(nums[mid], target) == 0 )
                return mid;
        }
        return -1;
    }
}
