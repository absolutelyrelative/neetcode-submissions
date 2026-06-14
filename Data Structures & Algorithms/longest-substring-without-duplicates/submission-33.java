class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int size = 0;

        while(right < s.length()) {
            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                
                left++;
            }
            charSet.add(s.charAt(right));
            size = Math.max(size, right - left + 1);
            
            right++;
        }

        return size;
        
    }
}
