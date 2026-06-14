class Solution {

    public boolean containsDuplicates(String s) {
        char[] charArray = s.toCharArray();
        HashSet<Character> charSet = new HashSet<>();

        for(int ctr = 0; ctr < s.length(); ctr++) {
            if(charSet.contains(new Character(charArray[ctr]))) {
                return true;
            } else {
                charSet.add(new Character(charArray[ctr]));
            }
        }

        return false;
    }


    public int lengthOfLongestSubstring(String s) {
        if(s != null && s.length() != 0) {
            int left = 0, right = 1;
            int length = 1;
            char[] sArray = s.toCharArray();

            // "abcabcbb"
            //  lr          length=1
            //  l r         length=2
            //  l  r        length=3
            //     lr
            for(right = 1; right < s.length(); right++) {
                // Condition met (not repeated char WITHIN substring)
                if(containsDuplicates(s.substring(left, right + 1)) == false) {
                    length = Math.max(length, right - left + 1);
                }
                else {
                    left++;
                    right = left;
                }
            }

            return length;
        }
        return 0;
    }
}
