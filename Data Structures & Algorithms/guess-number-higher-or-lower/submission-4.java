/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 0;
        long right = n;

        while(left <= right) {
            long m = (left + right) / 2;

            if(-guess( (int) m) > 0) {
                right = m - 1;
            } else if (-guess((int) m) < 0) {
                left = m + 1;
            } else {
                return (int) m;
            }
        }
        return -1;
    }
}