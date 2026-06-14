class Solution {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        
        // 0, 1, 2, 3, 4, 5, - 6, ... 13
        //int[] arr = new int[right];

        while(left <= right) {
            int mid = (left + right) / 2;

            if( isCorrect(mid, x) < 0 ) {
                left = mid + 1;
            } else if ( isCorrect(mid, x) > 0 ) {
                right = mid - 1;
            } else{
                return mid;
            }
        }

        return -1;
        
    }

    public static int isCorrect(int mid, int correctValue) {
        if((long) mid*mid < correctValue && (long) (mid+1)*(mid+1) > correctValue) return 0;
        if((long) mid*mid < correctValue) return -1;
        //if(mid*mid > correctValue && (mid-1)*(mid-1) < correctValue) return 0;
        if((long) mid*mid > correctValue) return +1;
        return 0;
    }
}