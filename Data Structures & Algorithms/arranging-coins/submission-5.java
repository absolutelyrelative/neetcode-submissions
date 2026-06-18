class Solution {
    public long summatory(int n) {
        return ((long)n * ( (long)n + 1 )/2);
    }

    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        int numberOfStairs = Integer.MIN_VALUE;

        if(n == 0) return 1;

        while(left <= right) {
            int m = (left + right) / 2;

            if(isCorrect(m, n) > 0) {
                right = m - 1;
            } else if (isCorrect(m, n) < 0) {
                left = m + 1;
                numberOfStairs = Math.max(numberOfStairs, m);
            } else {
                return m;
            }
        }

        return numberOfStairs;
        
    }

    public int isCorrect(int m, int input) {
        if( summatory(m) > input ) return +1;
        else if( summatory(m) < input ) return -1;
        return 0;
    }
}