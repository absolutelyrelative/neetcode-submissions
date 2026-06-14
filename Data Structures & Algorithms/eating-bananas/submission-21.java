class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // get max value
        Arrays.sort(piles);
        int maxValue = piles[piles.length - 1];
        int left = 1;
        int right = maxValue;
        int solution = maxValue;

        // 1 2 3 4
        while (left <= right) {
            int mid = (left + right) / 2;
            
            // Calculate hours taken
            int hoursTaken = 0;
            for(int i : piles) {
                hoursTaken = hoursTaken + (int) Math.ceil( (double) i / mid);
            }
            //if (hoursTaken > h)
                
            if (hoursTaken <= h) {
                right = mid - 1;
                solution = Math.min(solution, mid);
            }
            if(hoursTaken > h) {
                left = mid + 1;
            }
        }

        return solution;
    }
}
