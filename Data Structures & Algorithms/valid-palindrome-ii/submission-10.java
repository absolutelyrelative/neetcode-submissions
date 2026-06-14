class Solution {

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    
    public boolean validPalindrome(String s) {
        // abbda
        // l   r true
        //  l r  false -> skip

        int left = 0;
        int right = s.length() - 1;
        int retries = 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            
        }

        return true;

    }
}