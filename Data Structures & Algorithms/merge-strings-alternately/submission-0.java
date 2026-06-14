class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(left <= word1.length() - 1 || right <= word2.length() - 1) {
            if(left <= word1.length() - 1) {
                stringBuilder.append(word1.charAt(left));
                left++;
            }
            if(right <= word2.length() - 1) {
                stringBuilder.append(word2.charAt(right));
                right++;
            }
        }

        return stringBuilder.toString();

    }
}