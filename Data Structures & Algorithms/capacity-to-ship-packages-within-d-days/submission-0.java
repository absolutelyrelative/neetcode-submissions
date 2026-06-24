class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        int minCapacity = Integer.MAX_VALUE;

        for(int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        while(left <= right) {
            int m = (left + right) / 2;

            if(canFit(weights, m, days) == true) {
                right = m - 1;
                minCapacity = Math.min(minCapacity, m);
            } else {
                left = m + 1;
            }
        }

        return minCapacity;
    }

    public static boolean canFit(int[] weights, int capacity, int days) {
        int daysPerCapacitySpecified = 0;
        int left = 0;
        int currentSum = 0;

        for(int right = 0; right < weights.length; right++) {
            currentSum = currentSum + weights[right];

            if(currentSum > capacity) {
                left = right;
                currentSum = weights[right];
                daysPerCapacitySpecified++;
            }
        }

        if( daysPerCapacitySpecified > days - 1 ) return false;
        return true;
    }
}