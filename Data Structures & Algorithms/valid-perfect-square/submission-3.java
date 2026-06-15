class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while(left <= right) {
            int m = (left + right) / 2;

            if (isCorrect(m, num) > 0) {
                right = m - 1;
            } else if (isCorrect(m, num) < 0) {
                left = m + 1;
            } else {
                return true;
            }
        }

        return false;
        
    }

    public static int isCorrect(int m, int num) {
        if((long) m*m > num) return +1;
        if((long) m*m < num) return -1;
        return 0;
    }
}